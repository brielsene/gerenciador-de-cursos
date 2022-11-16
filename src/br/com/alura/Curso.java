package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso implements Comparable<Curso> {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	
	public List<Aula> getAulas() {
		//Imutável, só conseguimos adicionar uma nova pelo método adiciona
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	@Override
	public int compareTo(Curso outroCurso) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(outroCurso.getNome());
	}
	
	
	//métodos que irei aprender no java 8
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		
		
	}
	
	@Override
	public String toString() {
		
		return "Curso: "+this.nome+" Instrutor: "+this.instrutor+" Tempo total: "+this.getTempoTotal()+ " minutos"+" Aulas: "+
				this.aulas;
				
				}

	}
	

	



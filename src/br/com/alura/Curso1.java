package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso1 {
	private String nome, instrutor;
	private List<Aula>aulas = new ArrayList<Aula>();
	
	public Curso1(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	

}

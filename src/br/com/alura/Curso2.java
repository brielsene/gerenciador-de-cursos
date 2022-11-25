package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso2 implements Comparable<Curso2> {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno>alunos = new HashSet<>();
	private Map<Integer, Set<Aluno>> matriculaParaAluno = new HashMap<>();
	
	public Curso2(String nome, String instrutor) {
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
	public int compareTo(Curso2 outroCurso) {
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

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), (Set<Aluno>) aluno);
		
		
		
		
		
		
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculadoAluno(Aluno a1) {
		
		return this.alunos.contains(a1);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException("A Matricula: "+numero+ "Não existe");
		}
		return (Aluno)matriculaParaAluno.get(numero);
		
	}


	
	

	}
	

	



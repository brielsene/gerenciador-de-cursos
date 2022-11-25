package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunoNoCurso {

	public static void main(String[] args) {
		Curso javaCurso = new Curso("Java na prática", "Gabriel");

		javaCurso.adiciona(new Aula("POO", 15));
		javaCurso.adiciona(new Aula("Compile seu código", 10));
		javaCurso.adiciona(new Aula("Java avançado", 60));

		Aluno a1 = new Aluno("Gabriel Costa", 3466);
		Aluno a2 = new Aluno("Joao Guilherme", 3469);
		Aluno a3 = new Aluno("Mauricio Aniche", 3466);

		javaCurso.matricula(a1);
		javaCurso.matricula(a2);
		javaCurso.matricula(a3);
		
		System.out.println("Dados do aluno Gabriel Costa?");
		Aluno aluno = javaCurso.buscaMatriculadoPorNome("Joao Guilherme");
		System.out.println("Aluno: "+aluno);
		
		System.out.println();
//		
//		System.out.println("Quem é o aluno com matrícula 3466?");
//		Aluno aluno2 = javaCurso.buscaMatriculadoPorNumeroMatricula(3466);
//		System.out.println("Aluno: "+aluno);
		
		//Buscar por Numero da Matrícula
		
		System.out.println("Quem é o aluno com a Matrícula 3466?");
		Aluno aluno2 = javaCurso.buscaMatriculadoPorNumeroMatricula(3469);
		System.out.println(aluno2);
//		
		
		
		
		

	}

}

package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso1 javaCurso = new Curso1("Java na prática", "Gabriel");
		Curso1 python = new Curso1("Python na prática", "Gabriel");
		
		python.adiciona(new Aula("Inicio Python", 15));

		javaCurso.adiciona(new Aula("POO", 15));
		javaCurso.adiciona(new Aula("Compile seu código", 10));

		
		
		System.out.println(javaCurso.getAulas());
		System.out.println(python.getAulas());
		
		System.out.println();
		
		

	}

}

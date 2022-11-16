package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaCurso = new Curso("Java na prática", "Gabriel");
		Curso python = new Curso("Python na prática", "Gabriel");
		
		python.adiciona(new Aula("Inicio Python", 15));

		javaCurso.adiciona(new Aula("POO", 15));
		javaCurso.adiciona(new Aula("Compile seu código", 10));

		
		
		System.out.println(javaCurso.getAulas());
		System.out.println(python.getAulas());
		
		System.out.println();
		
		

	}

}

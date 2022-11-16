package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaCurso = new Curso("Java na prática", "Gabriel");
		
		
	

		javaCurso.adiciona(new Aula("POO", 15));
		javaCurso.adiciona(new Aula("Compile seu código", 10));
		javaCurso.adiciona(new Aula("Java avançado",60));
		
		List<Aula>aulasImutaveis = javaCurso.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		System.out.println(javaCurso.getTempoTotal());
		
		System.out.println();
		
		System.out.println(javaCurso);
		
		
		

		

		
		

	}

}

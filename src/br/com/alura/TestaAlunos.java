package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Ribeiro");
		alunos.add("Nico Steppat");
		alunos.add("Gabriel Sene");
		alunos.add("Joao Melo");
		alunos.add("Gabriel Sene");
		
		alunos.remove("Gabriel Sene");
		
		System.out.println(alunos.size());
		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		boolean gabrielEstaMatriculado = alunos.contains("Gabriel Sene");
		
		System.out.println(gabrielEstaMatriculado);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println();
		
		

	}

}

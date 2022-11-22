package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaCurso = new Curso("Java na prática", "Gabriel");
		
		
		

		javaCurso.adiciona(new Aula("POO", 15));
		javaCurso.adiciona(new Aula("Compile seu código", 10));
		javaCurso.adiciona(new Aula("Java avançado",60));
		
		Aluno a1 = new Aluno("Gabriel Costa",3466);
		Aluno a2 = new Aluno("Joao Guilherme",3469);
		Aluno a3 = new Aluno("Mauricio Aniche",3466);
		
		javaCurso.matricula(a1);
		javaCurso.matricula(a2);
		javaCurso.matricula(a3);
		
		System.out.println("todos os alunos matriculados nesse curso: ");
		
		Set<Aluno>alunos = javaCurso.getAlunos();
		Iterator<Aluno>iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
			
		}
		
		
		
		
//		javaCurso.getAlunos().forEach(alunos-> {
//			System.out.println(alunos);
//		});
		
		System.out.println("O aluno: "+a1+" está matriculado?");
		System.out.println(javaCurso.estaMatriculadoAluno(a1));
		
		
		Aluno gabriel = new Aluno("Gabriel Costa",3466);
		System.out.println("E esse Costa, está matriculado?");
		System.out.println(javaCurso.estaMatriculadoAluno(gabriel));
		
		
		System.out.println("O a1 é equals Ao Costa? ");
		System.out.println(a1.equals(gabriel));
		
		//Obrigatóriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == gabriel.hashCode());
		
				
		
		
		

	}

}

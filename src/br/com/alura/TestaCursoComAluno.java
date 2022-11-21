package br.com.alura;

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
		javaCurso.getAlunos().forEach(alunos-> {
			System.out.println(alunos);
		});
				
		
		
		

	}

}

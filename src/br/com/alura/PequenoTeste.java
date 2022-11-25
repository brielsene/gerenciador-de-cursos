package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class PequenoTeste {

	public static void main(String[] args) {
		Set<Aluno>alunos = new HashSet<>();
		
		Aluno a1 = new Aluno("Gabriel", 5477);
		
		alunos.add(a1);
		
		alunos.forEach(exibeAlunos -> {
			System.out.println(exibeAlunos);
		});

	}

}

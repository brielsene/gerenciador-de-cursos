package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Teste2 {

	public static void main(String[] args) {
		Aula a4 = new Aula("Ensinando Java com Arrays", 15);
		Aula a5 = new Aula("Ensinando Java com Arrays e Lists", 20);
		Aula a6 = new Aula("Aula de testes", 17);

		ArrayList<Aula> lista = new ArrayList<>();
		lista.add(a4);
		lista.add(a5);
		lista.add(a6);
		// sem ordenação
		System.out.println(lista);

		// Classe Collections, com metódo estático sort
		// Passar a ArrayList, e acessar o metodo Comparator comparing, passando a
		// Classe do objeto, e o parametro que quer ordenar
		Collections.sort(lista, Comparator.comparing(Aula::getTempo));
		System.out.println();
		System.out.println(lista);

		System.out.println();
		Collections.sort(lista, Comparator.comparing(Aula::getTitulo));

		System.out.println(lista);
	}

}

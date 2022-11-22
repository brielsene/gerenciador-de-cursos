package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterador {

	public static void main(String[] args) {
		List<String> nomes = new LinkedList<>();
		
		nomes.add("jorge");
		nomes.add("Gabriel");
		nomes.add("Isadora");
		
		Iterator iterador = nomes.iterator();
		
		while(iterador.hasNext()) {
			String proximo = (String) iterador.next();
			System.out.println(proximo);
		}

	}

}

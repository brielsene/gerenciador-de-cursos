package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class TestaCarros {

	public static void main(String[] args) {
		Collection<String>carros = new HashSet<>();
		List<String>carros2 = new ArrayList<>();
		
		carros.add("Jetta");
		carros.add("velar f");
		carros.add("Golf");
		carros.add("Veloster");
		
		System.out.println(carros);
		
		System.out.println(carros.contains("Golf"));
		
		carros.remove("Veloster");
		
		System.out.println(carros);
		
		System.out.println(carros.size());
		
		System.out.println();
		
		carros.forEach(carro ->{
			System.out.println(carro);
		});
		
		carros2.add("Fox");
		carros2.add("Porsche panamera");
		carros2.add("Elantra");
		carros2.add("A8 audi");
		
		Collections.sort(carros2);
		System.out.println();
		
		carros2.forEach(obj ->{
			System.out.println(obj);
		});
		
		System.out.println();
		
		
		System.out.println(carros2);
		
		
		
		
		//
		
		
		

	}

}

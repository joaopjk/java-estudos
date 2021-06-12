package com.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de Lista";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		String aula4 = "Conhecendo mais de Lista";

		List<String> aulas = new ArrayList<String>();
		aulas.addAll(Arrays.asList(aula1, aula2, aula3, aula4));
		// aulas.remove(0);
		// aulas.remove(aula2);

		System.out.println(aulas);
		aulas.forEach(System.out::println);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);

		// Irá modificar a lista
		Collections.sort(aulas);
		System.out.println(aulas);
	}
}

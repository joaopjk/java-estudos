package com.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.classesAux.Aula;
import com.classesAux.Curso;

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

		aulas.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		Aula a1 = new Aula("Revisitando as ArraysLists", 21);
		Aula a2 = new Aula("Lista de objetos", 20);
		Aula a3 = new Aula("Brincando o List", 30);

		ArrayList<Aula> objAulas = new ArrayList<Aula>();
		objAulas.addAll(Arrays.asList(a1, a2, a3));
		System.out.println(objAulas);

		Collections.sort(objAulas);
		Collections.sort(objAulas, Comparator.comparing(Aula::getTempo));
		objAulas.sort(Comparator.comparing(Aula::getTempo));
		
		Curso javaColecoes = new Curso("Java", "Matheus");
		javaColecoes.addAllAula(objAulas);
		System.out.println(javaColecoes);
		
		List<Aula> aulasLista = javaColecoes.getAulas();
		System.out.println(aulasLista);
		
		List<Aula> aulasMutaveies = new ArrayList<>(aulasLista);
		Collections.sort(aulasMutaveies);
		System.out.println(javaColecoes.getTempoTotal());
		
		Collections.reverse(aulasLista);
		Collections.shuffle(aulasLista);
		//List<Type> types = new ArrayList<>(Collections.nCopies(1000, null));
	}
}

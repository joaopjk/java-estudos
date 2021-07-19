package com.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.classesAux.Aula;
import com.classesAux.Curso;
/*
 * Arrays (vetores /Matrizes)
 * Um tamanho tem tamanho fixo.
 * Um array tem tipo de dado fixo.
 * É difícil encontrar um determinado elemente em um array.
 * 
 * Collections: (coleções)
 * Java possui diversas classes/interfaces que facilitam muito o trabalho quando se trata de dados. Essas classes/interfaces
 * são chamadas de Collections.
 * 
 * Listas:
 * Aceitam repetição de valores.
 * Possui tamanho ilimitado
 * Caso não tem tipo definido o arraylist, aceita valores de qualquer tipo 
 */

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
		// List<Type> types = new ArrayList<>(Collections.nCopies(1000, null));

		// ArrayList nomes = new ArrayList();
		// ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Pedro");

		Collections.sort(nomes);
		nomes.forEach(System.out::println);
		System.out.println(nomes.get(0));

//		double media = Arrays.stream(vetor).average();
//		media.ifPresent(System.out::println);

		for (Aula aula : aulasLista) {
			System.out.println(aula.getTitulo());
		}

		List<Integer> numerosInteiros = new ArrayList<Integer>();
		numerosInteiros.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		numerosInteiros.add(0, 100);
		System.out.println(numerosInteiros.size());
		numerosInteiros.remove(1);
		numerosInteiros.removeIf(x -> x % 2 == 0);
		numerosInteiros.indexOf(0);
		List<Integer> numerosInteiros2 = numerosInteiros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		numerosInteiros2.forEach(System.out::println);
		Integer numero = numerosInteiros.stream().filter(x -> x % 2 == 0).findAny().orElse(null);
		System.out.println(numero);
	}
}

package com.method_references;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("aluna");
		palavras.add("editora");
		palavras.add("hoje");
		palavras.add("caelum");

		// Factor de comparator
		palavras.sort(Comparator.comparing(s -> s.toString().length()));
		System.out.println(palavras);

		Comparator<String> comparador = Comparator.comparing(s -> s.toString().length());
		palavras.sort(comparador);

		Function<String, Integer> funcao = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		Comparator<String> comparador2 = Comparator.comparing(funcao);
		palavras.sort(comparador2);

		palavras.sort(Comparator.comparing(String::length));
		Function<String, Integer> funcao2 = String::length;
		Comparator<String> comparador3 = Comparator.comparing(funcao2);
		palavras.sort(comparador3);

		Function<String, Integer> funcao3 = s -> s.length();
		Comparator<String> comparador4 = Comparator.comparing(funcao3);
		palavras.sort(comparador4);

		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		palavras.forEach(System.out::println);
	}
}

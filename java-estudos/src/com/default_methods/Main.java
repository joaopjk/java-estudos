package com.default_methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*
 * Novidade apartir da versão 8
 * Default_methods -> São métodos concretos implementados em uma interface.
 */
public class Main {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("João");
		palavras.add("Play2");
		palavras.add("Integer");
		palavras.add("Agora");
		palavras.add("Paulo");
		palavras.add("Amanda");
		palavras.add("Tempo");
		
		Comparator<String>comparador = new ComparadorPorTamanho();
		
		palavras.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() < o2.length())
					return -1;
				if (o1.length() > o2.length())
					return 1;
				return 0;
			}
		});
		palavras.sort(comparador);
		
		palavras.forEach(System.out::println);

		palavras.sort((x, y) -> Integer.compare(x.length(), y.length()));
		
		MinhaClasse t = new MinhaClasse();
		t.meu_metodo();
		
		Consumer<String> imprimeNaLinha = new ImprimeNaLinha();
		palavras.forEach(imprimeNaLinha);
	}
}

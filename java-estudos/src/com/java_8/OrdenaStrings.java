package com.java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("aluna");
		palavras.add("editora");
		palavras.add("hoje");
		palavras.add("caelum");

		// Forma antiga de fazer ordenação
		Collections.sort(palavras);
		System.out.println(palavras);
		Comparator<String> comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);

		// Forma nova
		palavras.sort(comparador);
		System.out.println(palavras);

		// Antig0
		for (String string : palavras) {
			System.out.println(string);
		}

		// Novo
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
	}

}

// Toda classe de comparador precisar implementar o comparator
class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}

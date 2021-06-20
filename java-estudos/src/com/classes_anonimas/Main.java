package com.classes_anonimas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * Classe anônimas são classes sem nome, instânciando uma interface, dando new em uma classe anônima
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

		Consumer<String> consumidor = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};

		palavras.forEach(consumidor);

		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
	}
}

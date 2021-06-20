package com.classes_anonimas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * Classe an�nimas s�o classes sem nome, inst�nciando uma interface, dando new em uma classe an�nima
 */
public class Main {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Jo�o");
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

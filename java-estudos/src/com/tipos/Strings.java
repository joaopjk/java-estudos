package com.tipos;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		String palavras = "João Cícero Vicente Sousa";

		System.out.println(palavras.toLowerCase());
		System.out.println(palavras.toUpperCase());
		System.out.println(palavras.substring(5));
		System.out.println(palavras.substring(0, 9));
		System.out.println(palavras.indexOf("J"));
		System.out.println(palavras.lastIndexOf("S"));

		String[] listas = palavras.split(" ");
		Arrays.asList(listas).forEach(System.out::println);
	}

}

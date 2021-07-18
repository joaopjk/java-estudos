package com.tipos;

import java.util.Arrays;

public class Strings {
/*
 * Imutabilidade: String uma vez criada, não é alterado.
 */
	public static void main(String[] args) {
		String palavras = "João Cícero Vicente Sousa";//Object literal

		System.out.println(palavras.toLowerCase());//Imutabilidade
		System.out.println(palavras.toUpperCase());
		System.out.println(palavras.substring(5));
		System.out.println(palavras.substring(0, 9));
		System.out.println(palavras.indexOf("J"));
		System.out.println(palavras.lastIndexOf("S"));
		System.out.println(palavras.replace("João", "Gostosão"));
		
		palavras = "";
		System.out.println(palavras);
		String[] listas = palavras.split(" ");
		Arrays.asList(listas).forEach(System.out::println);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Socorram");
		sb.append("-");
		sb.append("me");
		sb.append(",");
		sb.append("subi");
		sb.append("no");
		sb.append("ônibus");
		sb.append("em");
		sb.append("Marrocos");
		System.out.println(sb.toString());
		
		CharSequence cs = new StringBuilder("João Cícero Vicente Sousa");
		System.out.println(cs);
	}

}

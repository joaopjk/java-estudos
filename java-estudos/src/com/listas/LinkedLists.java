package com.listas;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {
	/*
	 * Tem indice Garante indice de inserção Lista duplamente encadeada
	 */
	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("Primeira String");
		lista.addAll(Arrays.asList("Segunda String", "Terceira String", "Quarta String"));
		lista.remove(1);
		lista.size();
	}
}

package com.listas;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Vectors {
/*
 * Threadsafe
 */
	public static void main(String[] args) {
		List<String> lista = new Vector<String>();
		lista.add("Primeira String");
		lista.addAll(Arrays.asList("Segunda String", "Terceira String", "Quarta String"));
		lista.remove(1);
		lista.size();
	}
}

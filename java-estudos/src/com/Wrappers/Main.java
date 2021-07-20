package com.Wrappers;

import java.util.ArrayList;
import java.util.List;

public class Main {
	/*
	 * - São classes equivalentes aos tipos primitivos - Boxing e unboxing é natural
	 * da linguagem - Uso comum: campos de entidades em sistemas de informação, pois
	 * esses tipos aceitam o valor null e usufruem dos recuros OO char = Character
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x = 20;
		Integer obj = x;
		
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		Double dRef = Double.valueOf(3.2);
		Boolean bRef = Boolean.FALSE;
		Number numero = Integer.valueOf(98);
		
		List<Number> lista = new ArrayList<>();
		lista.add(1);
		lista.add(3.2);
		lista.add(33.1f);
	}

}

package com.BoxingUnboxing;

public class Main {
	/*
	 * Boxing: É o processo de conversão de um objeto tipo valor para um objeto tipo
	 * referência compatível Unboxing: É o processo de conversão de um objeto tipo
	 * referência para um objeto tipo valor compatível
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Boxing
		int x = 20;
		Object obj = x;

		// Unboxing
		int y = (int) obj;
	}

}

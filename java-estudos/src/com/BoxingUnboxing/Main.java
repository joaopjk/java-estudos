package com.BoxingUnboxing;

public class Main {
	/*
	 * Boxing: � o processo de convers�o de um objeto tipo valor para um objeto tipo
	 * refer�ncia compat�vel Unboxing: � o processo de convers�o de um objeto tipo
	 * refer�ncia para um objeto tipo valor compat�vel
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

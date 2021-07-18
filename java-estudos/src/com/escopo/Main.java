package com.escopo;

public class Main {
	/*
	 * Escopo de uma variável: é a regão do programa onde a variável é válida, ou
	 * seja, onde ela pode ser referenciada Uma variável não pode ser usada se ela
	 * não for iniciada
	 */
	public static void main(String[] args) {
		double price = 400, discount;

		System.out.println(price);

		if (price < 2000)
			discount = 1000;
		else
			discount = 0;

		System.out.println(discount);
	}

}

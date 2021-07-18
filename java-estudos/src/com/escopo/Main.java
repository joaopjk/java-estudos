package com.escopo;

public class Main {
	/*
	 * Escopo de uma vari�vel: � a reg�o do programa onde a vari�vel � v�lida, ou
	 * seja, onde ela pode ser referenciada Uma vari�vel n�o pode ser usada se ela
	 * n�o for iniciada
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

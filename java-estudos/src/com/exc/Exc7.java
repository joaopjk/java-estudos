package com.exc;

import java.util.Scanner;

public class Exc7 {
	static Scanner teclado = new Scanner(System.in);
	static int numero;

	public static void main(String[] args) {
		System.out.println("Digite o número a ser consultado:");
		numero = Integer.parseInt(teclado.nextLine());

		if (numero < 0)
			System.out.println("NEGATIVO");
		else
			System.out.println("NAO NEGATIVO");

		teclado.close();
	}

}

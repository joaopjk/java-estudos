package com.exc;

import java.util.Scanner;

public class Exc1 {

	static int valor1, valor2;
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o primeiro número para somar");
		valor1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o segundo número para somar");
		valor2 = Integer.parseInt(teclado.nextLine());

		somarNumero();
		teclado.close();
	}

	private static void somarNumero() {
		System.out.println(valor1 + valor2);

	}

}

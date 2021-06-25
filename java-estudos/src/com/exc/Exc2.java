package com.exc;

import java.util.Scanner;

public class Exc2 {

	static final float AREA = 3.14159f;
	static int numero;
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o valor para obter área: ");
		numero = Integer.parseInt(teclado.nextLine());

		System.out.println(Math.pow(numero, 2) * AREA);
		teclado.close();
	}
}

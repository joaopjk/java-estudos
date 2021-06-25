package com.exc;

import java.util.Scanner;

public class Exc3 {
	static Scanner teclado = new Scanner(System.in);
	static int A, B, C, D;

	public static void main(String[] args) {
		System.out.println("Digite o valor de A: ");
		A = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o valor de B: ");
		B = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o valor de C: ");
		C = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o valor de D: ");
		D = Integer.parseInt(teclado.nextLine());

		System.out.println(A * B - C * D);
		teclado.close();
	}
}

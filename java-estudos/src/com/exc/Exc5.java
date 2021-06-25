package com.exc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc5 {
	static Scanner teclado = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#,###.00");
	static int cod1, num1, cod2, num2;
	static float valor1, valor2;

	public static void main(String[] args) {
		System.out.println("Digite o código da primeira peça: ");
		cod1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o número da primeira peça: ");
		num1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o valor da primeira peça: ");
		valor1 = Float.parseFloat(teclado.nextLine());

		System.out.println("Digite o código da segunda peça: ");
		cod2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o número da segunda peça: ");
		num2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o valor da segunda peça: ");
		valor2 = Float.parseFloat(teclado.nextLine());

		System.out.println("VALOR A PAGAR: R$" + df.format((num1 * valor1) + (num2 * valor2)));
	}
}

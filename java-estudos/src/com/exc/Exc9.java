package com.exc;

import java.util.Scanner;

/*
 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
 */
public class Exc9 {
	static Scanner teclado = new Scanner(System.in);
	static int numero;
	static boolean ePar;

	public static void main(String[] args) {
		System.out.println("Digte um n�mero: ");
		numero = Integer.parseInt(teclado.nextLine());

		ePar = numero % 2 == 0;
		
		if(ePar)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		
		teclado.close();
	}
}

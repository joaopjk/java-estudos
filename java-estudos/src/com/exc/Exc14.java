package com.exc;

import java.util.Locale;
import java.util.Scanner;

public class Exc14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a quantidade de minutos gastos pelo usuário: ");
		int minutos = Integer.parseInt(teclado.nextLine());

		double conta = 50;

		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Total a pagar: %.2fn%n",conta);
		
		teclado.close();
	}

}

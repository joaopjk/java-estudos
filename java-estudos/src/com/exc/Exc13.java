package com.exc;

import java.util.Scanner;

public class Exc13 {
	static Scanner teclado = new Scanner(System.in);
	static float numero;

	public static void main(String[] args) {
		System.out.println("Digite o n�mero :");
		numero = Float.parseFloat(teclado.nextLine());

		if (numero >= 0 && numero <= 25)
			System.out.println("Intervalo [0,25]");
		else if (numero > 25 && numero <= 50)
			System.out.println("Intervalo [25,50]");
		else if (numero > 50 && numero <= 75)
			System.out.println("Intervalo [50,75]");
		else if (numero > 75 && numero <= 100)
			System.out.println("Intervalo [75,100]");
		else
			System.out.println("Fora do intervalo");

		teclado.close();
	}

}

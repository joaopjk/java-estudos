package com.exc;

import java.util.Scanner;
/*
 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente.
 */
public class Exc8 {
	static Scanner teclado = new Scanner(System.in);
	static int numero, numero1;
	static boolean saoMultiplos;

	public static void main(String[] args) {
		System.out.println("Digite o primeiro n�mero:");
		numero = Integer.parseInt(teclado.nextLine());

		System.out.println("Digite o segundo n�mero:");
		numero1 = Integer.parseInt(teclado.nextLine());

		if (numero < numero1)
			saoMultiplos = numero1 % numero == 0;
		else
			saoMultiplos = numero % numero1 == 0;

		if (saoMultiplos)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");

		teclado.close();
	}
}

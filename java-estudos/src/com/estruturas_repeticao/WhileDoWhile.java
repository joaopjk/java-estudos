package com.estruturas_repeticao;

import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			System.out.println("Informe sua idade: ");
			idade = teclado.nextInt();

			System.out.println("Nome: " + nome + " Idade: " + idade);

		} while (idade > 0);

		while (idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			System.out.println("Informe sua idade: ");
			// idade = teclado.nextInt(); Bug
			idade = Integer.parseInt(teclado.nextLine());

			System.out.println("Nome: " + nome + " Idade: " + idade);
		}
		teclado.close();
	}

}

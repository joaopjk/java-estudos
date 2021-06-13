package com.estruturas_repeticao;

import java.util.Scanner;

public class ForForEach {

	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			System.out.println("Informe sua idade: ");
			idade = teclado.nextInt();

			System.out.println("Nome: " + nome + " Idade: " + idade);
		}

		teclado.close();
	}

}

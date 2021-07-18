package com.estruturas_repeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		double numero = 1, soma = 0;
		Scanner sc = new Scanner(System.in);

		while (numero != 0) {
			System.out.println("Digite o número: ");
			numero = sc.nextDouble();
			soma += numero;

			System.out.println(soma);
		}

		sc.close();
	}

}

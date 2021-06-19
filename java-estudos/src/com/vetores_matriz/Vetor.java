package com.vetores_matriz;

import java.util.Scanner;

//São conhecidos como Array(vetores uni-dimensionais)
public class Vetor {
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int qtd;

		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());

		cadastrarDado(qtd);
		mostrarDados();

		teclado.close();
	}

	static void cadastrarDado(int qtd) {
		frutas = new String[qtd];

		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Informe a " + (1 + i) + " fruta :");
			frutas[i] = teclado.nextLine();
		}
	}

	static void mostrarDados() {
		for (int i = frutas.length - 1; i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}

	static int soma(int val1, int val2) {
		return val1 + val2;
	}
}

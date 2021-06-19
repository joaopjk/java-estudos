package com.funcoes;

import java.util.Scanner;

public class Funcoes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int quantidadeFrutas;

		System.out.println("Digite a quantidade de frutas: ");
		quantidadeFrutas = Integer.parseInt(teclado.nextLine());

		String frutas[] = new String[quantidadeFrutas];

		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Digite o nome da fruta: ");
			frutas[i] = teclado.nextLine();
		}

		String frutasAoContrario[] = reverterOrdemDasFrutas(frutas);

		for (String string : frutasAoContrario) {
			System.out.println(string);
		}

		teclado.close();
	}

	private static String[] reverterOrdemDasFrutas(String[] frutas) {
		String aux[] = new String[frutas.length];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = frutas[frutas.length - (i + 1)];
		}
		return aux;
	}

}

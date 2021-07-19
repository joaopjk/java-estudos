package com.vetores_matriz;

import java.util.Scanner;

public class Matriz {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int numeros[][] = new int[4][4];
		int maisNumero[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = j * i;
			}
		}

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.parseInt(sc.nextLine());
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					System.out.println(matriz[i][j]);
				}
			}
		}

		sc.close();
	}

}

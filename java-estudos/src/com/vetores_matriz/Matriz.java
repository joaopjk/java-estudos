package com.vetores_matriz;

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
	}

}

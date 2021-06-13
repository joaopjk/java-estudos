package com.vetores_matriz;


//São conhecidos como Array(vetores uni-dimensionais)
public class Vetor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int numeros[] = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		int numero[] = { 1, 2, 3, 4, 5 };
		float floats[] = new float[5];
		String nome[] = new String[4];

		for (int num : numeros) {
			System.out.println(num);
		}
	}

}

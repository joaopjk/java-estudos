package com.estruturas_repeticao;

public class Main {

	public static void main(String[] args) {
		int numeros[] = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}

		try {
			for (int i = 0; i <= numeros.length; i++) {
				System.out.println(numeros[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Deu mensagem de erro !");
		}
		
	}

}

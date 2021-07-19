package com.exc;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Exc16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OptionalDouble media;
		int qtdVertor = Integer.parseInt(sc.nextLine());

		double[] vetor = new double[qtdVertor];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a altura:");
			vetor[i] = Double.parseDouble(sc.nextLine());
		}
		sc.close();
		
		media = Arrays.stream(vetor).average();
		double media2 = Arrays.stream(vetor).average().orElse(0);
		media.ifPresent(System.out::println);
		System.out.println(media2);		
	}

}

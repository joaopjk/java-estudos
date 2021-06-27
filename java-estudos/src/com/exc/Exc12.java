package com.exc;

import java.util.Scanner;

/*
 * Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, sem
qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 */
public class Exc12 {
	static Scanner teclado = new Scanner(System.in);
	static float salario, imposto;

	public static void main(String[] args) {
		System.out.println("Digite seu sal�rio para calcular imposto de renda: ");
		salario = Float.parseFloat(teclado.nextLine());

		if (salario <= 2000)
			imposto = 0;
		else if (salario <= 3000)
			imposto = salario * 0.8f;
		else if (salario <= 4500)
			imposto = salario * 0.18f;
		else
			imposto = salario * 0.28f;

		System.out.printf("R% %.2f%n", imposto);
	}
}

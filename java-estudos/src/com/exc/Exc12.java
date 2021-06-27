package com.exc;

import java.util.Scanner;

/*
 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 */
public class Exc12 {
	static Scanner teclado = new Scanner(System.in);
	static float salario, imposto;

	public static void main(String[] args) {
		System.out.println("Digite seu salário para calcular imposto de renda: ");
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

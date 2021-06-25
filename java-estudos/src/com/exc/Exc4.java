package com.exc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc4 {
	static Scanner teclado = new Scanner(System.in);
	static int numero, horas;
	static float salario;

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Digite o n�mero do funcion�rio: ");
		numero = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o horas trabalhadas do funcion�rio: ");
		horas = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = Float.parseFloat(teclado.nextLine());

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = " + df.format(horas * salario));
		teclado.close();
	}
}

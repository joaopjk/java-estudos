package com.exc;

import java.util.Scanner;

public class Exc15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;

		System.out.println("Digite o número do dia da semana [1 a 8]: ");
		int numeroDia = Integer.parseInt(teclado.nextLine());

		switch (numeroDia) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "inválido";
			break;
		}

		System.out.println("O dia da semana é: " + dia);
		teclado.close();
	}

}

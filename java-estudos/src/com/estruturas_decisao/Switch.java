package com.estruturas_decisao;

public class Switch {

	public static void main(String[] args) {
		int numero = 5;

		//Funciona sem o brak, mas vai passar em todos os cases. O default � opcional.
		switch (numero) {
		case 0:
			System.out.println("O n�mero � 0");
			break;
		case 3:
			System.out.println("O n�mero � 3");
			break;
		case 5:
			System.out.println("O n�mero � 5");
			break;
		default:
			System.out.println("O n�mero � :" + numero);
			break;
		}

	}

}

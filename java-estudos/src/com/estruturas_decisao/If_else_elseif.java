package com.estruturas_decisao;

public class If_else_elseif {

	public static void main(String[] args) {
		int numero = 9, x = 5;

		if (numero > 5)
			System.out.println("Sim, o n�mero � maior que 5. N�mero: " + numero);
		else if (numero == 5)
			System.out.println("O n�mero � igual a 5. N�mero: " + numero);
		else
			System.out.println("N�o, o n�mero n�o � maior que 5. N�mero: " + numero);

		System.out.println("Bom dia ");
		if (x > 0) {
			System.out.println("Bom Tarde ");
		}
		System.out.println("Bom Noite ");
	}

}

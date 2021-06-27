package com.estruturas_decisao;

public class If_else_elseif {

	public static void main(String[] args) {
		int numero = 9, x = 5;

		if (numero > 5)
			System.out.println("Sim, o número é maior que 5. Número: " + numero);
		else if (numero == 5)
			System.out.println("O número é igual a 5. Número: " + numero);
		else
			System.out.println("Não, o número não é maior que 5. Número: " + numero);

		System.out.println("Bom dia ");
		if (x > 0) {
			System.out.println("Bom Tarde ");
		}
		System.out.println("Bom Noite ");
	}

}

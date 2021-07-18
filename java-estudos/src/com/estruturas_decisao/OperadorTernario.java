package com.estruturas_decisao;

public class OperadorTernario {

	public static void main(String[] args) {
		int valor = 3, numero;

		numero = (valor > 0) ? valor : 7;
		System.out.println(numero);

		double preco = 34.5;
		double desconto;

		desconto = (preco < 20) ? preco * 0.1 : preco * 0.5;
		System.out.println(desconto);
	}

}

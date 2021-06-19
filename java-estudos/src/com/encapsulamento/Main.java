package com.encapsulamento;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João Cícero Vicente Sousa", "Rua Gama Cerqueira 1050");
		Cliente maria = new Cliente("Maria de Jesus", "Rua Gama Cerqueira 1050");

		Conta contaJoao = new Conta(1, 100f, 200f, joao);
		Conta contaMaria = new Conta(2, 1000f, 2000f, maria);
		System.out.println("Saldo João: " + contaJoao.getSaldo());
		System.out.println("Saldo Maria: " + contaMaria.getSaldo());
	}

}

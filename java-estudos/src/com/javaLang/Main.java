package com.javaLang;

import com.encapsulamento.Cliente;
import com.encapsulamento.Conta;

/*
 * A classe object, faz parte do pacote java.lang
 */
public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta(1, 100, 50, new Cliente("João Cícero Vicente Sousa", "Rua Gama Cerqueira 1050"));
		Conta c2 = new Conta(1, 1000, 500, new Cliente("Jucemie Sousa Santos", "Rua Gama Cerqueira 1050"));

		System.out.println(c1);
		System.out.println(c2);
	}

}

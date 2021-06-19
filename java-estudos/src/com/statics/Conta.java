package com.statics;

/*
Atributos estáticos são atributos, onde os valores são compartilhados entre instâncias da classe.

Método estático não depende de uma instância de uma class para ser utilizado
*/
public class Conta {
	private int numero;
	private String cliente;
	public static int contador = 1;

	public Conta(String cliente) {
		super();
		this.numero = contador;
		this.cliente = cliente;
		Conta.contador += 1;
	}

	public int getNumero() {
		return numero;
	}

	public String getCliente() {
		return cliente;
	}

	public static int getContador() {
		return Conta.contador;
	}
}

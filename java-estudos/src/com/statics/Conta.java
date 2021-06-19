package com.statics;

public class Conta {
	private int numero;
	private String cliente;
	public static int contador = 1;

	public Conta(String cliente) {
		super();
		this.numero = contador + 1;
		this.cliente = cliente;
		Conta.contador += 1;
	}

	public int getNumero() {
		return numero;
	}

	public String getCliente() {
		return cliente;
	}

}

package com.statics;

/*
Atributos est�ticos s�o atributos, onde os valores s�o compartilhados entre inst�ncias da classe.

M�todo est�tico n�o depende de uma inst�ncia de uma class para ser utilizado
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

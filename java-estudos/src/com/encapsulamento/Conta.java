package com.encapsulamento;

/*
 *Getter:
 - é o método publico, que serve para consultar os dados
 */
@SuppressWarnings("unused")
public class Conta {

	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;

	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo + limite;
		this.limite = limite;
		this.cliente = cliente;
	}

	public void sacar(float valor) {
		if (valor <= this.saldo)
			this.saldo -= valor;
		else
			System.out.println("Saldo insuficiente !");
	}

	public void depositar(float valor) {
		this.saldo += valor;
	}

	public float getSaldo() {
		return saldo + this.limite;
	}

}

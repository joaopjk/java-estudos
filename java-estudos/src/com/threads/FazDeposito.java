package com.threads;

import com.encapsulamento.Conta;

public class FazDeposito implements Runnable {
	private Conta conta;

	public FazDeposito(Conta conta) {
		super();
		this.conta = conta;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void run() {
		this.conta.depositar(1000);
	}
}

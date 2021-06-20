package com.threads;

import com.encapsulamento.Cliente;
import com.encapsulamento.Conta;

/*
 * Para executar m�todos em paralelos � necess�rio implementar a classe Runnable na classe 
 * Por padr�o, as threads n�o s�o sincronizadas
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
//		BarraDeProgresso barra = new BarraDeProgresso();
//		//barra.executa();		
//		GeraRelatorio relatorio = new GeraRelatorio();
//		//relatorio.executa();
//		
//		Thread t1 = new Thread(barra);
//		t1.start();
//		Thread t2 = new Thread(relatorio);
//		t2.start();
//		System.out.println("Finalizado");

		Cliente cliente = new Cliente("Jo�o C�cero Vicente Sousa", "Rua Gama Cerqueira 1050");
		Conta conta = new Conta(1, 200, 300, cliente);

		FazDeposito acao = new FazDeposito(conta);
		Thread thread = new Thread(acao);
		Thread thread1 = new Thread(acao);
		thread.start();
		thread1.start();

		thread.join();
		thread1.join();
		
		System.out.println(conta.getSaldo());
	}

}

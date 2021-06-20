package com.threads;

/*
 * Para executar métodos em paralelos é necessário implementar a classe Runnable na classe 
 */
public class Main {

	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		//barra.executa();		
		GeraRelatorio relatorio = new GeraRelatorio();
		//relatorio.executa();
		
		Thread t1 = new Thread(barra);
		t1.start();
		Thread t2 = new Thread(relatorio);
		t2.start();
		System.out.println("Finalizado");
	}
	
}

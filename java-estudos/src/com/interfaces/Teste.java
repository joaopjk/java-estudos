package com.interfaces;

public interface Teste {
	int valor = 9;
	public String mensagem();
	default void meu_metodo() {
		System.out.println("Meu método abstrato");
	}
}

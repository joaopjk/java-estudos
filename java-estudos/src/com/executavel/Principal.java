package com.executavel;

import java.util.Scanner;

import com.encapsulamento.Cliente;
import com.encapsulamento.Conta;

/*
 * JAR - Java Archive -> Arquivo execut�vel Java
 */
public class Principal {
	static Cliente cliente = new Cliente("Jo�o C�cero Vicente Sousa", "Rua Gama Cerqueira,1050");
	static Conta conta = new Conta(1, 1000f, 200f, cliente);
	static Scanner teclado = new Scanner(System.in);
	
	public static void depositar() {
		System.out.println("Informe o valor para dep�sito:");
		float valor = teclado.nextFloat();
		if(valor >0) {
			conta.depositar(valor);
		}
		else {
			System.out.println("Valor para dep�sito necessitar ser positivo ! ");
		}
	}
	
	public static void main(String[] args) {
		
	}
}

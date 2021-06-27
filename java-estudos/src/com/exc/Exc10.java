package com.exc;

import java.util.Scanner;

/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
  começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
 */

public class Exc10 {

	static Scanner teclado = new Scanner(System.in);
	static int inicio,fim,duracao;
	
	public static void main(String[] args) {
		System.out.println("Digite o horário de inicio: ");
		inicio = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o horário de fim: ");
		fim = Integer.parseInt(teclado.nextLine());
		
		if(inicio < fim)
			duracao = fim - inicio;
		else
			duracao = 24 - inicio + fim;
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		teclado.close();
	}

}

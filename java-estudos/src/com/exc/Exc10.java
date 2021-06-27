package com.exc;

import java.util.Scanner;

/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
  come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas
 */

public class Exc10 {

	static Scanner teclado = new Scanner(System.in);
	static int inicio,fim,duracao;
	
	public static void main(String[] args) {
		System.out.println("Digite o hor�rio de inicio: ");
		inicio = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o hor�rio de fim: ");
		fim = Integer.parseInt(teclado.nextLine());
		
		if(inicio < fim)
			duracao = fim - inicio;
		else
			duracao = 24 - inicio + fim;
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		teclado.close();
	}

}

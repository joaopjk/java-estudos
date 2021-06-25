package com.exc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc6 {
	static Scanner teclado = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#,###.000");
	
	public static void main(String[] args) {
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		teclado.close();
	}

}

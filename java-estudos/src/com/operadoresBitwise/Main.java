package com.operadoresBitwise;

public class Main {
	/*
	 * &: Opera��o "E" bit a bit |: Opera��o "Ou" bit a bit ^: Opera��o
	 * "Ou-exclusivo" bit a bit
	 */
	public static void main(String[] args) {
		int n1 = 89, n2 = 60;

		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
	}

}

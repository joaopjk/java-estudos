package com.operadoresBitwise;

public class Main {
	/*
	 * &: Operação "E" bit a bit |: Operação "Ou" bit a bit ^: Operação
	 * "Ou-exclusivo" bit a bit
	 */
	public static void main(String[] args) {
		int n1 = 89, n2 = 60;

		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
	}

}

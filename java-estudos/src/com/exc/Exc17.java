package com.exc;

import java.util.Arrays;
import java.util.Scanner;

public class Exc17 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite a quantidade de produtos:");
		int qtd = Integer.parseInt(sc.nextLine());

		Product[] produtos = new Product[qtd];

		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Digite o nome do produto: ");
			String nome = sc.nextLine();
			System.out.println("Digite o preço do produto: ");
			double preco = Double.parseDouble(sc.nextLine());

			produtos[i] = new Product(nome, preco);
		}

		double mediaPreco = Arrays.stream(produtos).mapToDouble(Product::getPrice).average().orElse(0);

		System.out.printf("Average : %.2f%n", mediaPreco);
	}

	static public class Product {
		private String nome;
		private double price;

		public Product(String nome, double price) {
			this.nome = nome;
			this.price = price;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
	}
}

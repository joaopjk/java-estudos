package com.oo;

public class Encapsulamento {
	/*
	 * É um princípio que consiste em esconder detalhes de implementação de uma
	 * classe, expondo apenas as operações seguras e que mantenham os objetos em um
	 * estado consistente .Regra de ouro: o objeto deve sempre estar em um estado
	 * consistente, e a própria classe deve garantir isso. Um objeto não deve expor
	 * nenhum atributo(modificar de acesso private) Os atributos deve ser acessador
	 * por meio de métodos get e set
	 */

	private String name;
	private double price;

	public Encapsulamento(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

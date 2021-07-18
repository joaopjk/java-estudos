package com.oo;

public class Encapsulamento {
	/*
	 * � um princ�pio que consiste em esconder detalhes de implementa��o de uma
	 * classe, expondo apenas as opera��es seguras e que mantenham os objetos em um
	 * estado consistente .Regra de ouro: o objeto deve sempre estar em um estado
	 * consistente, e a pr�pria classe deve garantir isso. Um objeto n�o deve expor
	 * nenhum atributo(modificar de acesso private) Os atributos deve ser acessador
	 * por meio de m�todos get e set
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

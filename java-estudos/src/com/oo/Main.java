package com.oo;

/*
 - Objetos são produtos/instâncias da classe;
 */
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Declaração
		Produto p0;
		//Declaração e criação do objeto
		//produto -> instância de produto
		Produto produto = new Produto();
		produto.nome = "Notebook";
		produto.preco = 2367f;
		produto.desconto = 1;
		
		System.out.println(produto.nome);
		System.out.println(produto.preco);
		System.out.println(produto.desconto);
	}

}

package com.oo;

/*
 - Objetos s�o produtos/inst�ncias da classe;
 */
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Declara��o
		Produto p0;
		//Declara��o e cria��o do objeto
		//produto -> inst�ncia de produto
		Produto produto = new Produto();
		produto.nome = "Notebook";
		produto.preco = 2367f;
		produto.desconto = 1;
		
		System.out.println(produto.nome);
		System.out.println(produto.preco);
		System.out.println(produto.desconto);
	}

}

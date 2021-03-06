package com.xml;

public class Produto {
	private String nome;
	private double preco;
	private String descricao;
	private int codigo;

	public Produto(String nome, double preco, String descricao, int codigo) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}

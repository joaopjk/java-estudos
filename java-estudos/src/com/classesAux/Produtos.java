package com.classesAux;

public class Produtos {
	private int codigo;
	private String especificacao;
	private float preco;

	public Produtos(int codigo, String especificacao, float preco) {
		super();
		this.codigo = codigo;
		this.especificacao = especificacao;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}

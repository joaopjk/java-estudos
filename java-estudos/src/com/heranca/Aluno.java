package com.heranca;

public class Aluno extends Pessoa {
	private String ra;

	public Aluno(String nome, int anoNascimento, String ra) {
		super(nome, anoNascimento);
		this.ra = ra;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

}

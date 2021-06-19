package com.heranca;

public class Professor extends Pessoa {
	private String matricula;

	public Professor(String nome, int anoNascimento,String matricula) {
		super(nome, anoNascimento);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}

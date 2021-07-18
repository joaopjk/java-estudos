package com.classesAux;

/**
 * Classe que representa um aluno.
 * @author João Cícero Vicente Sousa
 * @version 1.0
 *
 */
public class Aluno {
	private String nome;
	private String numeroMatricula;

	public Aluno(String nome, String numeroMatricula) {
		super();
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	/**
	 * 
	 * @return Nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

}

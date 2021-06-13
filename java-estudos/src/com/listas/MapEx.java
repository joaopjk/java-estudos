package com.listas;

import com.classesAux.Aluno;
import com.classesAux.Aula;
import com.classesAux.Curso;

public class MapEx {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.addAula(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.addAula(new Aula("Criando uma Aula", 20));
		javaColecoes.addAula(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", "34672");
		Aluno a2 = new Aluno("Guilherme Silveira", "5617");
		Aluno a3 = new Aluno("Mauricio Aniche", "17645");

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		//javaColecoes.buscaMatricula("");
	}
}

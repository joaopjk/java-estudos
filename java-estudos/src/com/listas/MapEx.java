package com.listas;

import java.util.HashMap;
import java.util.Map;

import com.classesAux.Aluno;
import com.classesAux.Aula;
import com.classesAux.Curso;

/*
 * A classe HashMap implementa a interface Map e trabalha com chave/valor
 * Não aceita chaves duplicadas 
 */
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

		// javaColecoes.buscaMatricula("");

		Map<String, Integer> contas = new HashMap<String, Integer>();

		contas.put("João", 138733);
		contas.forEach((k, v) -> System.out.println("Key: "+k + "| Value: " + v));
	}
}

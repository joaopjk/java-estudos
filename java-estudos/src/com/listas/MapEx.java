package com.listas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.classesAux.Aluno;
import com.classesAux.Aula;
import com.classesAux.Curso;

/*
 * A classe HashMap implementa a interface Map e trabalha com chave/valor
 * Não aceita chaves duplicadas 
 * 
 */
public class MapEx {
	@SuppressWarnings("unused")
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
		contas.forEach((k, v) -> System.out.println("Key: " + k + "| Value: " + v));

		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		pessoas.put(138733, "João");
		pessoas.put(138734, "Pedro");
		pessoas.put(138735, "Paulo");
		pessoas.put(138736, "Antonieta");
		pessoas.put(138737, "Promo");

		pessoas.keySet().forEach(System.out::println);
		pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));
		// Chaves
		System.out.println(pessoas.keySet());
		// Valores
		System.out.println(pessoas.values());
		// Associações
		System.out.println(pessoas.entrySet());

		Set<Integer> chaves = pessoas.keySet();
		Collection<String> valores = pessoas.values();

		pessoas.values().forEach(System.out::println);
		pessoas.keySet().forEach(System.out::println);

		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for (Entry<Integer, String> entry : associacoes) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		pessoas.entrySet().forEach(a -> System.out.println(a.getKey() + " - " + a.getValue()));
	}
}

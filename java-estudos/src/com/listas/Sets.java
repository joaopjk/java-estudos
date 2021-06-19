package com.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.classesAux.Aluno;
import com.classesAux.Aula;
import com.classesAux.Curso;

/*
 * Os conjuntos são implementados com a interface Set (HashSet).
 * Melhor performance
 * Os elementos dentro de um Set não se repetem
 * A order dos elementos não é levado em consideração
 * Não aceita a Collections.sort();
 */
public class Sets {

	public static void main(String[] args) {

		// Você não tem a garantida da ordem dos objetos.
		Set<String> alunos = new HashSet<>();
		alunos.add("João Cícero Vicente Sousa");
		alunos.add("Alberto Sousa");
		alunos.add("Francini Iara Sousa");

		alunos.forEach(System.out::println);
		System.out.println(alunos);

		boolean joao = alunos.contains("João Cícero Vicente Sousa");
		System.out.println(joao);

		Aula a1 = new Aula("Revisitando as ArraysLists", 21);
		Aula a2 = new Aula("Lista de objetos", 20);
		Aula a3 = new Aula("Brincando o List", 30);
		Curso javaColecoes = new Curso("Java", "Matheus");
		ArrayList<Aula> objAulas = new ArrayList<Aula>();
		objAulas.addAll(Arrays.asList(a1, a2, a3));
		javaColecoes.addAllAula(objAulas);

		Aluno aluno1 = new Aluno("João", "138733");
		Aluno aluno2 = new Aluno("Cícero", "138734");
		Aluno aluno3 = new Aluno("Vicente", "138735");

		javaColecoes.matricula(aluno1);
		javaColecoes.matricula(aluno2);
		javaColecoes.matricula(aluno3);
		// javaColecoes.getAlunosSet().addAll(Arrays.asList(aluno1, aluno2, aluno3));
		Set<String> alunosSincronizados = Collections.synchronizedSet(alunos);
		System.out.println(alunosSincronizados);

		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		letras.forEach(System.out::println);

		Set<String> nomes = new HashSet<String>();
		nomes.add("João");
		nomes.addAll(Arrays.asList("Pedro", "Paulo", "Pietro"));
		
		boolean foiAdicionado = nomes.add("João");
		System.out.println(foiAdicionado);
	}

}

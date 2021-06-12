package com.listas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.classesAux.Curso;

public class Stream {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Java", 60));
		cursos.add(new Curso("C#", 35));
		cursos.add(new Curso("Swift", 25));

		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.forEach(s -> System.out.println(s.getNome()));

		cursos.stream().filter(s -> s.getAlunos() > 40).forEach(c -> System.out.println(c.getNome()));
		cursos.stream().map(c -> c.getAlunos()).forEach(System.out::println);
		int soma = cursos.stream().mapToInt(Curso::getAlunos).sum();
		System.out.println(soma);
	}
}

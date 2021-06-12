//Documentação: http://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
package com.listas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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

		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));
		cursos.stream().map(Curso::getNome).forEach(System.out::println);
		Optional<Curso> algum = cursos.stream().filter(c -> c.getAlunos() > 50).findAny();
		Curso umCurso = algum.orElse(null);
		System.out.println(umCurso);
		algum.ifPresent(c -> System.out.println(c.getNome()));

		cursos = cursos.stream().filter(c -> c.getAlunos() > 10).collect(Collectors.toList());
		Map<String, Integer> mapper = cursos.stream().filter(c -> c.getAlunos() > 10)
				.collect(Collectors.toMap(c -> c.getNome(), d -> d.getAlunos()));
		System.out.println(mapper);

		cursos.stream().filter(c -> c.getAlunos() > 10).collect(Collectors.toMap(c -> c.getNome(), d -> d.getAlunos()))
				.forEach((nome, alunos) -> System.out.println("Curso: " + nome + " Alunos: " + alunos));
		cursos.parallelStream().filter(c -> c.getAlunos() > 50);

		cursos.stream().filter(c -> c.getAlunos() > 50).findFirst();
		
		OptionalDouble média = cursos.stream().mapToInt(Curso::getAlunos).average();
		System.out.println(média);
		
		List<Curso> stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		System.out.println(stream);
		
	}
}

package com.classesAux;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	private String nome;
	private int alunos;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunosSet = new HashSet<>();

	public Curso(String nome, String instrutor, List<Aula> aulas, Set<Aluno> alunosSet) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
		this.aulas = aulas;
		this.setAlunosSet(alunosSet);
	}

	public Curso(String nome, int alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}

	public void addAula(Aula aula) {
		this.aulas.add(aula);
	}

	public void addAllAula(List<Aula> listAulas) {
		this.aulas.addAll(listAulas);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public Set<Aluno> getAlunosSet() {
		return Collections.unmodifiableSet(alunosSet);
	}

	public void setAlunosSet(Set<Aluno> alunosSet) {
		this.alunosSet = alunosSet;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", alunos=" + alunos + ", instrutor=" + instrutor + ", aulas=" + aulas + "]";
	}

	public void matricula(Aluno aluno1) {
		this.alunosSet.add(aluno1);
	}
}

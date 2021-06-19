package com.oo;

/*Classe
 - O nome das classes inicia com letra mai�scula:
 - O nome n�o deve conter: Acentua��o, caracteres especiais,espa�o
 - Toda classe Java, n�o existe a Main()
 - O nome da classe Java DEVE ser o mesmo do arquivo java.
 - Tudo que estiver dentro das "chaves {}" faz parte da chave
 
 *Atributos
 - S�o as caracter�sticas da class/molde/modelo de dados:
 - Atributos podem ser chamados de estados.
 - Atributos s�o nomeados em letras min�sculas, sem espa�os, sem caracteres especiais, sem acentua��o
 
  *M�todos
  - Podemos enteder os m�todos como a a��o que realizada por um objeto da classe
  - Os m�todos s�o comportamentos dos objetos da classe
  - Tipo de retorno | Nome que corresponde a a��o do m�todo | Parametros (opcionais) | Retorno
  
   *Construtor
  - O construtor de uma classe SEMPRE tem o mesmo nome da classe;
  - Por padr�o, a JVM, cria em tempo de execu��o um construtor padr�o (vazio)
  - Podemos ter mais de um construtor na classe
 */
public class Produto {
	String nome;
	float preco;
	float desconto;
	
	public Produto() {
		super();
	}

	public Produto(String nome, float preco, float desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	void aumentarPreco(float valor) {
		this.preco += valor;
	}
	
	float precoAumentado(float valor) {
		return this.preco += valor;
	}
}

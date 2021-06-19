package com.oo;

/*Classe
 - O nome das classes inicia com letra maiúscula:
 - O nome não deve conter: Acentuação, caracteres especiais,espaço
 - Toda classe Java, não existe a Main()
 - O nome da classe Java DEVE ser o mesmo do arquivo java.
 - Tudo que estiver dentro das "chaves {}" faz parte da chave
 
 *Atributos
 - São as características da class/molde/modelo de dados:
 - Atributos podem ser chamados de estados.
 - Atributos são nomeados em letras minúsculas, sem espaços, sem caracteres especiais, sem acentuação
 
  *Métodos
  - Podemos enteder os métodos como a ação que realizada por um objeto da classe
  - Os métodos são comportamentos dos objetos da classe
  - Tipo de retorno | Nome que corresponde a ação do método | Parametros (opcionais) | Retorno
  
   *Construtor
  - O construtor de uma classe SEMPRE tem o mesmo nome da classe;
  - Por padrão, a JVM, cria em tempo de execução um construtor padrão (vazio)
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

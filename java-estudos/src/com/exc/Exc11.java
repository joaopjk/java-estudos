package com.exc;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.classesAux.Produtos;

public class Exc11 {
	static Scanner teclado = new Scanner(System.in);
	static int codigo,quantidade;
	
	
	public static void main(String[] args) {
		List<Produtos> produtos = new ArrayList<Produtos>();
		produtos.add(new Produtos(1,"Chachorro Quente",4.50f));
		produtos.add(new Produtos(2,"X-salada",4.50f));
		produtos.add(new Produtos(3,"X-Bacon",5.00f));
		produtos.add(new Produtos(4,"Torrada Simples",2.00f));
		produtos.add(new Produtos(5,"Refrigerante",1.50f));
		
		System.out.println("Digite o código do produto: ");
		codigo = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite a quantidade do produto");
		quantidade = Integer.parseInt(teclado.nextLine());
		
		OptionalDouble preco = produtos.stream().filter(p -> p.getCodigo() == codigo).mapToDouble(Produtos::getPreco).findFirst();
		preco.ifPresent(x -> {
			System.out.printf("Total: R$:  %.2f%n",(preco.getAsDouble() * quantidade));
		});
	}
}

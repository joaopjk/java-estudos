package com.enumeracoes;

public class Main {

	public static void main(String[] args) {
		OrderStatus orderStatus = OrderStatus.valueOf("DELIVERED");
		System.out.println(orderStatus);
	}
}

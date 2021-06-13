package com.tipos;

public class TiposNumericos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Tipos primários
		int num1 = 4;// Inteiro
		short num2 = 4; // Inteiro (curto)
		byte num5 = 5;
		long num0 = 0;
		char char9 = 34;
		// Tipos não primários
		Integer num3 = 98;
		Short num4 = 7;
		Long num00 = (long) 999999999;
		// tipos primitivos/primários
		float preco = 23.4f;
		double valor = 34.5;

		Float preco2 = 23.4f;
		Double valor2 = 256.55;
		Byte bite = 7;
		Character character = 98;

		System.out.println(Integer.SIZE + " bits");
		System.out.println(Short.SIZE + " bits");
		System.out.println(Byte.SIZE + " bits");
		System.out.println(Character.SIZE);
		System.out.println(Character.SIZE);	
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);			
	}

}

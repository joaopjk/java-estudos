package com.threads;

public class GeraRelatorio implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("Gerando Relat�rio....");
		}
	}
}

package com.interfaces;

public class Ventilador implements IEletronico {
	private boolean ligado = false;

	@Override
	public void ligar() {
		if (!this.ligado)
			this.ligado = true;
	}

	@Override
	public void desligar() {
		if (this.ligado)
			this.ligado = false;
	}

}

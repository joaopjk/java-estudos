package com.default_methods;

import com.interfaces.Teste;

public class MinhaClasse implements Teste {

	@Override
	public String mensagem() {
		meu_metodo();
		return "Minha mensagem";
	}

}

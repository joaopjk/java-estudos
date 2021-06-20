package com.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;

public class ProdutoTeste {
	
	@Test
	public void gerarXML() {
		String xmlEsperado = "<produto codigo=\"1587\">\n"
				+ "  <nome>Geladeira</nome>\n"
				+ "  <preco>1000.0</preco>\n"
				+ "  <descrição>Geladeira duas portas</descrição>\n"
				+ "</produto>";

		Produto geladeira = new Produto("Geladeira", 1000.0, "Geladeira duas portas",1587);

		XStream x = new XStream();
		x.alias("produto", Produto.class);
		x.aliasField("descrição", Produto.class,"descricao");
		x.useAttributeFor(Produto.class,"codigo");
		String xmlGerado = x.toXML(geladeira);

		assertEquals(xmlEsperado, xmlGerado);
	}
}

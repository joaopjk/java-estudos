package com.example.produtosapi.controller;

import com.example.produtosapi.model.Produto;
import com.example.produtosapi.repository.ProdutosRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    private ProdutosRepository produtoRepository;

    public ProdutoController(ProdutosRepository produtosRepository) {
        produtoRepository = produtosRepository;
    }



    @PostMapping
    public Produto Salvar(@RequestBody Produto produto) {
        produto.setId(UUID.randomUUID().toString());

        produtoRepository.save(produto);

        return produto;
    }
}

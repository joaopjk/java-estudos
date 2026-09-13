package com.example.produtosapi.controller;

import com.example.produtosapi.model.Produto;
import com.example.produtosapi.repository.ProdutosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    private final ProdutosRepository produtoRepository;

    public ProdutoController(ProdutosRepository produtosRepository) {
        produtoRepository = produtosRepository;
    }

    @PostMapping
    public Produto Salvar(@RequestBody Produto produto) {
        produto.setId(UUID.randomUUID().toString());

        produtoRepository.save(produto);

        return produto;
    }

    @GetMapping("/{id}")
    public Produto BuscarPorId(@PathVariable String id) {
        return produtoRepository.findById(id).orElse(null);
    }
}

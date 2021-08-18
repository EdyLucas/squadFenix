package br.com.taiff.mesadeteste.controller;

import br.com.taiff.mesadeteste.ProdutoRepository;
import br.com.taiff.mesadeteste.dto.NovoProdutoRequest;
import br.com.taiff.mesadeteste.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

// Teste Edy

@RestController
@RequestMapping("/gravarproduto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;


    @PostMapping
    public ResponseEntity<?>criarProduto(@RequestBody @Valid NovoProdutoRequest request){

         Produto produto = request.toModel();

        produtoRepository.save(produto);


        return  ResponseEntity.ok().build();
    }


}

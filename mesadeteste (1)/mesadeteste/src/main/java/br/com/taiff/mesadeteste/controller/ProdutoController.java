<<<<<<< HEAD
package br.com.taiff.mesadeteste.controller;

import br.com.taiff.mesadeteste.dto.NovoProdutoRequest;
import br.com.taiff.mesadeteste.model.Produto;
import br.com.taiff.mesadeteste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@CrossOrigin("*")
@RestController
@RequestMapping("/gravaproduto")
public class ProdutoController {

     @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<?>gravarProduto(@RequestBody @Valid NovoProdutoRequest request){

        Produto produto = request.toModel();

        produtoRepository.save(produto);

        return ResponseEntity.ok().build();

    }

}
=======
package br.com.taiff.mesadeteste.controller;

import br.com.taiff.mesadeteste.dto.NovoProdutoRequest;
import br.com.taiff.mesadeteste.model.Produto;
import br.com.taiff.mesadeteste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/gravaproduto")
public class ProdutoController {

     @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<?>gravarProduto(@RequestBody @Valid NovoProdutoRequest request){

        Produto produto = request.toModel();

        produtoRepository.save(produto);

        return ResponseEntity.ok().build();

    }

}
>>>>>>> 459b8900328e7c08b817b86516ab45109e574d47

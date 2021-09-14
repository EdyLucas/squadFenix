<<<<<<< HEAD
package br.com.taiff.mesadeteste.controller;

import br.com.taiff.mesadeteste.dto.NovaPosicaoRequest;
import br.com.taiff.mesadeteste.dto.NovoProdutoRequest;
import br.com.taiff.mesadeteste.model.Posicao;
import br.com.taiff.mesadeteste.model.Produto;
import br.com.taiff.mesadeteste.repository.PosicaoRepository;
import br.com.taiff.mesadeteste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
@CrossOrigin("*")
@RestController
@RequestMapping("/gravarposicao")
public class GravarPosicaoController {

    @Autowired
    PosicaoRepository posicaoRepository;
    @PersistenceContext
    EntityManager entityManager;

    @PostMapping
    public ResponseEntity<?>gravarPosicao(@RequestBody @Valid NovaPosicaoRequest request){

        Posicao posicao = request.toModel(entityManager);

        posicaoRepository.save(posicao);

        return ResponseEntity.ok().build();

    }

}

=======
package br.com.taiff.mesadeteste.controller;

import br.com.taiff.mesadeteste.dto.NovaPosicaoRequest;
import br.com.taiff.mesadeteste.dto.NovoProdutoRequest;
import br.com.taiff.mesadeteste.model.Posicao;
import br.com.taiff.mesadeteste.model.Produto;
import br.com.taiff.mesadeteste.repository.PosicaoRepository;
import br.com.taiff.mesadeteste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/gravarposicao")
public class GravarPosicaoController {

    @Autowired
    PosicaoRepository posicaoRepository;
    @PersistenceContext
    EntityManager entityManager;

    @PostMapping
    public ResponseEntity<?>gravarPosicao(@RequestBody @Valid NovaPosicaoRequest request){

        Posicao posicao = request.toModel(entityManager);

        posicaoRepository.save(posicao);

        return ResponseEntity.ok().build();

    }

}

>>>>>>> 459b8900328e7c08b817b86516ab45109e574d47

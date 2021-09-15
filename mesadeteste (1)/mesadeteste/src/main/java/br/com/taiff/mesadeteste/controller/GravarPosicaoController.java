package br.com.taiff.mesadeteste.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.taiff.mesadeteste.dto.NovaPosicaoRequest;
import br.com.taiff.mesadeteste.model.Posicao;
import br.com.taiff.mesadeteste.repository.PosicaoRepository;

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


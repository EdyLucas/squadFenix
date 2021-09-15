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

import br.com.taiff.mesadeteste.dto.NovaTemperaturaRequest;
import br.com.taiff.mesadeteste.model.Temperatura;
import br.com.taiff.mesadeteste.repository.TemperaturaRepository;

@RestController
@RequestMapping("/gravartemperatura")
public class GravarTemperaturasController {

    @Autowired
    TemperaturaRepository temperaturaRepository;
    @PersistenceContext
    EntityManager entityManager;

    @PostMapping
    public ResponseEntity<?>gravarTemperatura(@RequestBody @Valid NovaTemperaturaRequest request){

        Temperatura temperatura = request.toModel();

        temperaturaRepository.save(temperatura);

        return ResponseEntity.ok().build();

    }

}



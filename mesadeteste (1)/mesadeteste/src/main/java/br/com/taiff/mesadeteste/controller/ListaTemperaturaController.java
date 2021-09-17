package br.com.taiff.mesadeteste.controller;

import br.com.taiff.mesadeteste.dto.ListaTemperaturaResponse;
import br.com.taiff.mesadeteste.model.Temperatura;
import br.com.taiff.mesadeteste.repository.TemperaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListaTemperaturaController {

    @Autowired
    private TemperaturaRepository temperaturaRepository;

    @GetMapping("/temperaturas")
    public List<ListaTemperaturaResponse> lista(){
        List<Temperatura>temperaturas = temperaturaRepository.findAll();
        return ListaTemperaturaResponse.toModel(temperaturas);
    }


}

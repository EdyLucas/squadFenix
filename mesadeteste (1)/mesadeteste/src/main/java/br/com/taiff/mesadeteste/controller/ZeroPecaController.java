package br.com.taiff.mesadeteste.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.taiff.mesadeteste.repository.ZeroPecaRepository;
import br.com.taiff.mesadeteste.dto.ZeroPecaRequest;
import br.com.taiff.mesadeteste.model.ZeroPeca;

@RestController
@RequestMapping("/zeropeca")
public class ZeroPecaController {
	
	@Autowired
	private ZeroPecaRepository zeropecaRepository;
	
	@PostMapping
	public ResponseEntity<?>zeroPeca(@RequestBody @Valid ZeroPecaRequest request){
		
		ZeroPeca zeroPeca = request.toModel();
		
		zeropecaRepository.save(zeroPeca);
		
		return ResponseEntity.ok().build();
	}

}

<<<<<<< HEAD
package br.com.taiff.mesadeteste.controller;

import br.com.taiff.mesadeteste.dto.ZeroPecaRequest;
import br.com.taiff.mesadeteste.model.ZeroPeca;
import br.com.taiff.mesadeteste.repository.ProdutoRepository;
import br.com.taiff.mesadeteste.repository.ZeroPecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/zeropeca")
public class ZeroPecaController {
	
	@Autowired
	private ZeroPecaRepository zeropecaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public ResponseEntity<?>zeroPeca(@RequestBody @Valid ZeroPecaRequest request){

		ZeroPeca zeroPeca = request.toModel(produtoRepository, zeropecaRepository);
		
		zeropecaRepository.save(zeroPeca);
		
		return ResponseEntity.ok().build();
	}

}
=======
package br.com.taiff.mesadeteste.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.taiff.mesadeteste.repository.ZeroPecaRepository;
import br.com.taiff.mesadeteste.dto.ZeroPecaRequest;
import br.com.taiff.mesadeteste.model.ZeroPeca;

@CrossOrigin("*")
@RestController
@RequestMapping("/zeropeca")
public class ZeroPecaController {
	
	@Autowired
	private ZeroPecaRepository zeropecaRepository;

	@PersistenceContext
	EntityManager entityManager;
	
	@PostMapping
	public ResponseEntity<?>zeroPeca(@RequestBody @Valid ZeroPecaRequest request){
		
		ZeroPeca zeroPeca = request.toModel(entityManager);
		
		zeropecaRepository.save(zeroPeca);
		
		return ResponseEntity.ok().build();
	}

}
>>>>>>> 459b8900328e7c08b817b86516ab45109e574d47

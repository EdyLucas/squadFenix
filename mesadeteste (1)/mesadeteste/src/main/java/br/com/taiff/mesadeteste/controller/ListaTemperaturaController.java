package br.com.taiff.mesadeteste.controller;

import br.com.taiff.mesadeteste.dto.ListaTemperaturaResponse;
import br.com.taiff.mesadeteste.model.Temperatura;
import br.com.taiff.mesadeteste.repository.MediaRepository;
import br.com.taiff.mesadeteste.repository.TemperaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
public class ListaTemperaturaController {

    private final TemperaturaRepository  temperaturaRepository;
    private final MediaRepository mediaRepository;
    

    public ListaTemperaturaController(TemperaturaRepository temperaturaRepository, MediaRepository mediaRepository) {
		super();
		this.temperaturaRepository = temperaturaRepository;
		this.mediaRepository = mediaRepository;
	}

	@GetMapping("/temperaturas")
    public List<ListaTemperaturaResponse> lista(){
        List<Temperatura>temperaturas = temperaturaRepository.findAll();
        return ListaTemperaturaResponse.toModel(temperaturas);
    }
	
	@GetMapping("/medias")
    public List<ListaTemperaturaResponse> listar(
    		@RequestParam(value = "id", required = false)Long id
    		){ 
		List<Temperatura>temperaturas = this.mediaRepository.findJ1(id);
		return ListaTemperaturaResponse.toModel(temperaturas);
    }
    		
    
	
    


}

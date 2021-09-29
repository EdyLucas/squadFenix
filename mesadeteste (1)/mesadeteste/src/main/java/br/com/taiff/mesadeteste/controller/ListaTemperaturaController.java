package br.com.taiff.mesadeteste.controller;

import br.com.taiff.mesadeteste.dto.ListaTemperaturaResponse;
import br.com.taiff.mesadeteste.model.Janela;
import br.com.taiff.mesadeteste.model.Temperatura;
import br.com.taiff.mesadeteste.repository.MediaRepository;
import br.com.taiff.mesadeteste.repository.TemperaturaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
	
	/*@GetMapping("/medias")
    public List<ListaTemperaturaResponse> listar(
    		@RequestParam(value = "id", required = false)Long id
    		){ 
		List<Temperatura>temperaturas;
		temperaturas = this.mediaRepository.findJanela(191L, 274L);
		return ListaTemperaturaResponse.toModel(temperaturas);*/


	@GetMapping("/medias")

	public List<Janela> retornaMedia(){

		Long[]faixaIn ={191L, 345L, 556L, 734L, 754L, 806L, 1066L, 1268L, 1442L, 1687L};
		Long[]faixaFin ={274L, 456L, 653L, 753L,787L, 931L, 1186L, 1377L, 1606L, 1807L };

		List<Janela>janelas = new ArrayList<>();

		for(int i= 0; i<faixaIn.length; i++){

			janelas.add(mediaRepository.findJanela(faixaIn[i], faixaFin[i]));
		}

		/*janelas.get(0).getMediaT1()*/



         return janelas;
	}


	/*@GetMapping("/medias2")
	public List<MediaTemperaturaResponse> lista(){
		return float[] temperature = mediaRepository.findJanela(191L, 274L);*/



    }


package br.com.taiff.mesadeteste.dto;

import br.com.taiff.mesadeteste.model.Posicao;

import javax.validation.constraints.NotBlank;

public class NovaPosicaoRequest {

    @NotBlank
    private int eixoX;
    @NotBlank
    private int eixoY;
    @NotBlank
    private int eixoZ;
    @NotBlank
    private float rotacao;
    @NotBlank
    private float tempo;
    @NotBlank
    private String modelo;

    public NovaPosicaoRequest(int eixoX, 
    		                  int eixoY, 
    		                  int eixoZ, 
    		                  float rotacao,
    		                  float tempo,
    						  String modelo
    						  ) {
    
    }
    public Posicao toModel() {
        return new Posicao(
	        		this.eixoX, 
	        		this.eixoY, 
	        		this.eixoZ, 
	        		this.rotacao,
	        		this.tempo,
					this.modelo 
        		          );
    }
}

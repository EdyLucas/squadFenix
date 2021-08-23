package br.com.taiff.mesadeteste.dto;

import javax.persistence.EntityManager;
import javax.validation.constraints.NotBlank;

import br.com.taiff.mesadeteste.model.Produto;
import br.com.taiff.mesadeteste.model.ZeroPeca;
import br.com.taiff.mesadeteste.validacao.CheckId;
import br.com.taiff.mesadeteste.validacao.UniqueValue;

public class ZeroPecaRequest {
	
	private String modelo;
	private int x;
	private int y;
	private int z;
	private int r;

    @UniqueValue(Classe = ZeroPeca.class, campo = "id")
	private Long produto;

	public ZeroPecaRequest(String modelo, int x, int y, int z, int r, Long produto) {
		this.modelo = modelo;
		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
		this.produto = produto;
	}

	public ZeroPeca toModel(EntityManager entityManager) {

 Produto a = entityManager.find(Produto.class, produto);
		
		return new ZeroPeca( this.x, this.y, this.z, this.r, a);
	}
	
	
}

package br.com.taiff.mesadeteste.dto;

import javax.validation.constraints.NotBlank;

import br.com.taiff.mesadeteste.model.ZeroPeca;

public class ZeroPecaRequest {
	
	private String modelo;
	private int x;
	private int y;
	private int z;
	private int r;
	
	public ZeroPecaRequest(String modelo, int x, int y, int z, int r) {
		this.modelo = modelo;
		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
	}
	
	public ZeroPeca toModel() {
		
		return new ZeroPeca(this.modelo, this.x, this.y, this.z, this.r);
	}
	
	
}

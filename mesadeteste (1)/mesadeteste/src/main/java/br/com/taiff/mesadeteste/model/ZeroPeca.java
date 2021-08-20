package br.com.taiff.mesadeteste.model;

import javax.persistence.*;

@Entity
public class ZeroPeca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String modelo;
	@Column(nullable = false)
	private int x;
	@Column(nullable = false)
	private int y;
	@Column(nullable = false)
	private int z;
	@Column(nullable = false)
	private int r;
	
	public ZeroPeca(String modelo, int x, int y, int z, int r) {
		this.modelo = modelo;
		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
	}
	
	
	

}

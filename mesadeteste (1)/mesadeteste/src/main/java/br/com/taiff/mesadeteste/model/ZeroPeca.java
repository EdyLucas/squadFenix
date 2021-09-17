package br.com.taiff.mesadeteste.model;


import javax.persistence.*;

@Entity

public class ZeroPeca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private int x;
	@Column(nullable = false)
	private int y;
	@Column(nullable = false)
	private int z;
	@Column(nullable = false)
	private int r;


    @OneToOne
	private Produto produto;




	public ZeroPeca( int x, int y, int z, int r, Produto produto) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
		this.produto = produto;
	}

	 @Deprecated
	public ZeroPeca() {
	}

	public Long getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public int getR() {
		return r;
	}

	public Produto getProduto() {
		return produto;
	}
}

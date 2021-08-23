package br.com.taiff.mesadeteste.model;

import javax.persistence.*;

@Entity
public class Posicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int eixoX;

    @Column(nullable = false)
    private int eixoY;
    
    @Column(nullable = false)
    private int eixoZ;
    
    @Column(nullable = false)
    private float rotacao;
    
    @Column(nullable = false)
    private float tempo;
    
    @Column(nullable = false)
    private String modelo;
 
    public Posicao(int eixoX, int eixoY, int eixoZ, float rotacao, float tempo, String modelo) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
        this.eixoZ = eixoZ;
        this.rotacao = rotacao;
        this.tempo = tempo;
        this.modelo = modelo;
    }
}

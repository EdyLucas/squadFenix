package br.com.taiff.mesadeteste.model;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String modelo;


    public Produto(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

      @Deprecated
    public Produto() {
    }


}

package br.com.taiff.mesadeteste.dto;

import br.com.taiff.mesadeteste.model.Produto;

public class NovoProdutoRequest {

    private String nome;
    private String modelo;

    public NovoProdutoRequest(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }


    public Produto toModel() {

       return new Produto(this.nome, this.modelo);


    }
}

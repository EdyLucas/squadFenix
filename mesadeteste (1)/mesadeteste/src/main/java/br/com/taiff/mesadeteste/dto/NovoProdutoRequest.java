package br.com.taiff.mesadeteste.dto;

import br.com.taiff.mesadeteste.model.Produto;

import javax.validation.constraints.NotBlank;

public class NovoProdutoRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String modelo;

    public NovoProdutoRequest(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }




    public Produto toModel() {

        return new Produto(this.nome, this.modelo);

    }

    @Override
    public String toString() {
        return "NovoProdutoRequest{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

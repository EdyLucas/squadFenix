package br.com.taiff.mesadeteste.dto;

import br.com.taiff.mesadeteste.model.Posicao;
import br.com.taiff.mesadeteste.model.Produto;
import javax.persistence.EntityManager;
import javax.validation.constraints.NotBlank;

public class NovaPosicaoRequest {


    private int eixoX;
    private int eixoY;
    private int eixoZ;

    private float rotacao;

    private float tempo;

    private Long produto;

    public NovaPosicaoRequest(int eixoX, int eixoY, int eixoZ, float rotacao, float tempo, Long produto) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
        this.eixoZ = eixoZ;
        this.rotacao = rotacao;
        this.tempo = tempo;
        this.produto = produto;
    }


    public Posicao toModel(EntityManager entityManager) {

        Produto a = entityManager.find(Produto.class, produto);

        return new Posicao( eixoX, eixoY, eixoZ, rotacao,tempo, a);
    }
}

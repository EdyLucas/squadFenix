package br.com.taiff.mesadeteste.dto;

import br.com.taiff.mesadeteste.model.Posicao;
import br.com.taiff.mesadeteste.model.Produto;

import javax.persistence.Column;
import javax.persistence.ManyToOne;


public class DetalhePosicaoResponse {


    private int eixoX;


    private int eixoY;


    private int eixoZ;


    private float rotacao;


    private float tempo;


    private Produto produto;

    public DetalhePosicaoResponse(Posicao posicao) {
        eixoX =posicao.getEixoX();
        eixoY = posicao.getEixoY();
        eixoZ = posicao.getEixoZ();
        rotacao = posicao.getRotacao();
        tempo = posicao.getTempo();
        produto = posicao.getProduto();
    }
}

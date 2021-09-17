package br.com.taiff.mesadeteste.dto;

import br.com.taiff.mesadeteste.model.Produto;
import br.com.taiff.mesadeteste.model.ZeroPeca;
import br.com.taiff.mesadeteste.repository.ProdutoRepository;
import br.com.taiff.mesadeteste.repository.ZeroPecaRepository;
import br.com.taiff.mesadeteste.validacao.UniqueValue;

import javax.management.RuntimeErrorException;

public class ZeroPecaRequest {

    private String modelo;
    private int x;
    private int y;
    private int z;
    private int r;

    //@UniqueValue(Classe = ZeroPeca.class, campo = "produto")
    private Long idProduto;

    public ZeroPecaRequest(String modelo, int x, int y, int z, int r, Long idProduto) {
        this.modelo = modelo;
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
        this.idProduto = idProduto;
    }


    public ZeroPeca toModel(ProdutoRepository produtoRepository, ZeroPecaRepository zeroPecaRepository) {
        Produto produto = produtoRepository
                .findById(this.idProduto)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

       boolean existeProduto = zeroPecaRepository.existsByProduto(produto);

       if (existeProduto) {
           throw new RuntimeException("já existe um zeropeça para esse produto");
       }
        return new ZeroPeca(this.x, this.y, this.z, this.r, produto);
    }


}

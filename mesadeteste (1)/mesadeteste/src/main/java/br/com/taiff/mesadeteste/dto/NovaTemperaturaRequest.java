package br.com.taiff.mesadeteste.dto;

import java.time.LocalDate;
import java.util.Date;


import br.com.taiff.mesadeteste.model.Temperatura;

public class NovaTemperaturaRequest {


    private int t1;


    private int t2;
    

    private int t3;
    

    private int tAmbiente;
    
    private LocalDate dataTeste;

    public NovaTemperaturaRequest(int t1, int t2, int t3, int tAmbiente, LocalDate dataTeste) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.tAmbiente = tAmbiente;
        this.dataTeste = dataTeste;
    }

    public Temperatura toModel() {
        return new Temperatura(
                this.t1,
                this.t2,
                this.t3,
                this.tAmbiente,
                this.dataTeste
        		);
    }
    
    /*
    @Override
    public String toString() {
        return "NovoProdutoRequest{" +
                "Temperatura 1 ='" + t1 + '\'' +
                "Temperatura 2 ='" + t2 + '\'' +
                "Temperatura 3 ='" + t3 + '\'' +
                "Temperatura Ambiente ='" + tAmbiente + '\'' +
                "Data do teste ='" + dataTime + '\'' +   
                '}';           
    }
    */
}


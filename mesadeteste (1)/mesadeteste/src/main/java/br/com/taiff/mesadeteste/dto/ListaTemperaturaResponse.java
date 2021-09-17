package br.com.taiff.mesadeteste.dto;

import br.com.taiff.mesadeteste.model.Temperatura;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTemperaturaResponse {
    private Long id;


    private int t1;

    private int t2;


    private int t3;


    private int tAmbiente;


    private LocalDate dataTeste;


    public ListaTemperaturaResponse(Temperatura temperatura) {
        id = temperatura.getId();
        t1 = temperatura.getT1();
        t2 = temperatura.getT2();
        t3 = temperatura.getT3();
        tAmbiente = temperatura.getTAmbiente();
        dataTeste = temperatura.getDataTeste();
    }
      public static List<ListaTemperaturaResponse> toModel(List<Temperatura>temperatura){
        return temperatura.stream().map(ListaTemperaturaResponse::new).collect(Collectors.toList());
      }

    public Long getId() {
        return id;
    }

    public int getT1() {
        return t1;
    }

    public int getT2() {
        return t2;
    }

    public int getT3() {
        return t3;
    }

    public int gettAmbiente() {
        return tAmbiente;
    }

    public LocalDate getDataTeste() {
        return dataTeste;
    }
}

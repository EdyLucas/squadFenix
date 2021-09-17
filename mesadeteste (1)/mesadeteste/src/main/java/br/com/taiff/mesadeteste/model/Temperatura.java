package br.com.taiff.mesadeteste.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Temperatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int t1;

    @Column(nullable = false)
    private int t2;
    
    @Column(nullable = false)
    private int t3;
    
    @Column(nullable = false)
    private int tAmbiente;
    

    private LocalDate dataTeste;


    public Temperatura(int t1, int t2, int t3, int tAmbiente, LocalDate dataTeste) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.tAmbiente = tAmbiente;
        this.dataTeste = dataTeste;
    }

      @Deprecated
    public Temperatura() {
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
    
    public int getTAmbiente() {
        return tAmbiente;
    }

    public LocalDate getDataTeste() {
        return dataTeste;
    }
}


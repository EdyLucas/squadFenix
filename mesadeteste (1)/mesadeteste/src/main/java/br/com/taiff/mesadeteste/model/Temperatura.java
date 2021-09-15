package br.com.taiff.mesadeteste.model;

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
    private float t1;

    @Column(nullable = false)
    private float t2;
    
    @Column(nullable = false)
    private float t3;
    
    @Column(nullable = false)
    private float tAmbiente;
    
    @Column(nullable = false)
    private Date dateTime;


    public Temperatura(float t1, float t2, float t3, float tAmbiente, Date dateTime) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.tAmbiente = tAmbiente;
        this.dateTime = dateTime;
    }

      @Deprecated
    public Temperatura() {
    }

    public Long getId() {
        return id;
    }

    public float getT1() {
        return t1;
    }

    public float getT2() {
        return t2;
    }
    
    public float getT3() {
        return t3;
    }
    
    public float getTAmbiente() {
        return tAmbiente;
    }
    
    public Date getDateTime() {
        return dateTime;
    }
}


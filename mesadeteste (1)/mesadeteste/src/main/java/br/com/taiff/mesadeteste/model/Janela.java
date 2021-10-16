package br.com.taiff.mesadeteste.model;

import java.text.DecimalFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Janela {
	
    private Long id;
    private float mediaT1;
    private float mediaT2 ;
    private float mediaT3;
    private float mediaTA;
    private float mediaM;
    
    public Janela(Long id,float mediaT1, float mediaT2, float mediaT3, float mediaTA) {
    	this.id = id;
        this.mediaT1 = mediaT1;
        this.mediaT2 = mediaT2;
        this.mediaT3 = mediaT3;
        this.mediaTA = mediaTA;
    }

    public String getMediaM() {
    	this.mediaM = (mediaT1 + mediaT2 + mediaT3)/3;
        return new DecimalFormat(".#").format(mediaM);
    }

    public String getMediaCor() {
    	float mediaCor = (mediaM + mediaTA -25);
        return new DecimalFormat(".#").format(mediaCor);
    }

    public String getMediaT1() {
        return new DecimalFormat(".#").format(mediaT1);
    }

    public Long getId() {
		return id;
	}

	public void setMediaT1(float mediaT1) {
        this.mediaT1 = mediaT1;
    }

    public String getMediaT2() {
        return new DecimalFormat(".#").format(mediaT2);
    }

    public void setMediaT2(float mediaT2) {
        this.mediaT2 = mediaT2;
    }

    public String getMediaT3() {
        return new DecimalFormat(".#").format(mediaT3);
    }

    public void setMediaT3(float mediaT3) {
        this.mediaT3 = mediaT3;
    }

    public String getMediaTA() {
        return new DecimalFormat(".#").format(mediaTA);
    }

    public void setMediaTA(float mediaTA) {
        this.mediaTA = mediaTA;
    }
}

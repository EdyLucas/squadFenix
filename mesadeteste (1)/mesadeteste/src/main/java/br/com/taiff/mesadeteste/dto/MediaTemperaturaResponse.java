package br.com.taiff.mesadeteste.dto;

import br.com.taiff.mesadeteste.model.Temperatura;
import br.com.taiff.mesadeteste.repository.MediaRepository;

import java.util.List;
import java.util.stream.Collectors;

public class MediaTemperaturaResponse {

    private float mediaT1;
    private float mediaT2;
    private float mediaT3;
    private float mediaTA;

    public MediaTemperaturaResponse(MediaRepository mediaRepository) {
        this.mediaT1 = mediaRepository.getMediaT1();
        this.mediaT2 = mediaRepository.getMediaT2();
        this.mediaT3 = mediaRepository.getMediaT3();
        this.mediaTA = mediaRepository.getMediaT4();
    }

    public static List<MediaTemperaturaResponse> toModel(List<MediaRepository>temperatura){
        return temperatura.stream().map(MediaTemperaturaResponse::new).collect(Collectors.toList());
    }


    public float getMediaT1() {
        return mediaT1;
    }

    public float getMediaT2() {
        return mediaT2;
    }

    public float getMediaT3() {
        return mediaT3;
    }

    public float getMediaTA() {
        return mediaTA;
    }
}

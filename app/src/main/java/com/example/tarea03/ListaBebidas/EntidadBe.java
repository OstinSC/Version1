package com.example.tarea03.ListaBebidas;

import java.io.Serializable;

public class EntidadBe implements Serializable {

    private int imgFoto2;
    private String titulo2;
    private String contenido2;


    public EntidadBe(int imgFoto2, String titulo2, String contenido2) {
        this.imgFoto2 = imgFoto2;
        this.titulo2 = titulo2;
        this.contenido2 = contenido2;
    }


    public int getImgFoto2() {
        return imgFoto2;
    }

    public String getTitulo2() {
        return titulo2;
    }

    public String getContenido2() {
        return contenido2;
    }


}

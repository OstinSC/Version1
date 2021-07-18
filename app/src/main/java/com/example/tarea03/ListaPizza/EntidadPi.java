package com.example.tarea03.ListaPizza;

import java.io.Serializable;

public class EntidadPi implements Serializable {


    private int imgFoto1;
    private String titulo1;
    private String contenido1;

    public EntidadPi(int imgFoto1, String titulo1, String contenido1) {
        this.imgFoto1 = imgFoto1;
        this.titulo1 = titulo1;
        this.contenido1 = contenido1;
    }

    public int getImgFoto1() {
        return imgFoto1;
    }

    public String getTitulo1() {
        return titulo1;
    }

    public String getContenido1() {
        return contenido1;
    }

}

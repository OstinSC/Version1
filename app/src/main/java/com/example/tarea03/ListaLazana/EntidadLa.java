package com.example.tarea03.ListaLazana;

import java.io.Serializable;

public class EntidadLa implements Serializable {


    private int imgFoto;
    private String titulo;
    private String contenido;
    double precio;

    public EntidadLa(int imgFoto, String titulo, String contenido, double precio) {
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.contenido = contenido;
        this.precio = precio;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
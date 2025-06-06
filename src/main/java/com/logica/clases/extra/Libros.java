package com.logica.clases.extra;

public class Libros {

    String titulo;
    String autor;
    int copiasDisponibles;

    public Libros(String titulo, String autor, int copiasDisponibles){
        this.titulo = titulo;
        this.autor = autor;
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Cantidad disponible: " + copiasDisponibles;
    }
}

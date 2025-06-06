package com.logica.clases.extra;

public class UsuarioLibreria {

    String nombre;
    int numeroID;
    String correo;

    public UsuarioLibreria(String nombre, int numeroID,String correo){
        this.nombre = nombre;
        this.numeroID = numeroID;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

        @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID: " + numeroID + ", Correo: " + correo;
    }
}

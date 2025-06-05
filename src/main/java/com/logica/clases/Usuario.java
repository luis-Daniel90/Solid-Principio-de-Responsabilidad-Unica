package com.logica.clases;

public class Usuario {

    public String nombre;
    public String email;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    public  String getNombre() {
        return nombre;
    }
    public  String getEmail() {
        return email;
    }
}

package com.logica.clases;

public class UsuariosIncorrecto {

    public String nombre;
    public String email;

    public UsuariosIncorrecto(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    public static void guardarBaseDatos(String nombre, String email){
        System.out.println("Datos guaradados");
    }

    public static void enviarCorreo(String email) {
        System.out.println("Correo enviado");
    }

}

package com.logica.clases;

public class GuardarBaseDatos {

    public static void guardarDatos(Usuario usuario){
        System.out.println("Datos guardados");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
    }
}

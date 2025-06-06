package com.logica.clases.extra;
import java.util.HashMap;
import java.util.Map;

public class RegistrarUsuarios {

    public static void registrarUsuario(UsuarioLibreria usuario){
        
        Map<Integer, UsuarioLibreria> users = new HashMap<>();


        // Aquí se guarda: clave = nombre, valor = objeto con nombre, ID y correo
        users.put(usuario.numeroID, new UsuarioLibreria(usuario.nombre, usuario.numeroID, usuario.correo));
        
        System.out.println("Usuario registrado correctamente.");
        System.out.println("Usuarios actuales:");
        users.forEach((numeroID, datos) -> System.out.println(numeroID + " => " + datos));
    }
}

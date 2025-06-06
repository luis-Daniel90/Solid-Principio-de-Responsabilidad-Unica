package com.logica.clases.extra;

import java.util.HashMap;
import java.util.Map;

public class RegistrarLibro {
    
    public static void registrarLibros(Libros libro){
        Map<String, Libros> book = new HashMap<>();

        book.put(libro.titulo, new Libros(libro.titulo, libro.autor, libro.copiasDisponibles));

                System.out.println("Libro registrado correctamente.");
        System.out.println("Libros actuales:");
        book.forEach((titulo, datos) -> System.out.println(titulo + " => " + datos));
    }

}

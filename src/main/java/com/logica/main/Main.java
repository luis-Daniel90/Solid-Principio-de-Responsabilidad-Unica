package com.logica.main;
import javax.imageio.spi.RegisterableService;

import com.logica.clases.EnviarCorreo;
import com.logica.clases.GuardarBaseDatos;
import com.logica.clases.Usuario;
import com.logica.clases.extra.Libros;
import com.logica.clases.extra.RegistrarLibro;
import com.logica.clases.extra.RegistrarUsuarios;
import com.logica.clases.extra.UsuarioLibreria;

public final class Main {
    public static void main(String[] args) {

        /*
         * Explora el "Principio SOLID de Responsabilidad Única (Single Responsibility
         * Principle, SRP)" y crea un ejemplo simple donde se muestre su funcionamiento
         * de forma correcta e incorrecta.
         */

        Usuario usuario = new Usuario("daniel", "daniel2");

        GuardarBaseDatos.guardarDatos(usuario);
        EnviarCorreo.envioCorreo(usuario);


        System.out.println();
        System.out.println("******************* EXTRA *******************");
        System.out.println();

        /* DIFICULTAD EXTRA (opcional):
        * Desarrolla un sistema de gestión para una biblioteca. El sistema necesita
        * manejar diferentes aspectos como el registro de libros, la gestión de usuarios
        * y el procesamiento de préstamos de libros.
        * Requisitos:
        * 1. Registrar libros: El sistema debe permitir agregar nuevos libros con
        * información básica como título, autor y número de copias disponibles.
        * 2. Registrar usuarios: El sistema debe permitir agregar nuevos usuarios con
        * información básica como nombre, número de identificación y correo electrónico.
        * 3. Procesar préstamos de libros: El sistema debe permitir a los usuarios
        * tomar prestados y devolver libros.
        * Instrucciones:
        * 1. Diseña una clase que no cumple el SRP: Crea una clase Library que maneje
        * los tres aspectos mencionados anteriormente (registro de libros, registro de
        * usuarios y procesamiento de préstamos).
        * 2. Refactoriza el código: Separa las responsabilidades en diferentes clases
        * siguiendo el Principio de Responsabilidad Única.
        */

        UsuarioLibreria user = new UsuarioLibreria("Daniel", 1, "Daniel@daniel.com");
        UsuarioLibreria user2 = new UsuarioLibreria("Luis", 2, "Luis@luis.com");
        RegistrarUsuarios.registrarUsuario(user2);
        RegistrarUsuarios.registrarUsuario(user);

        Libros book = new Libros("Anne Frank", "Anne Frank", 100);
        RegistrarLibro.registrarLibros(book);


    }
}

package com.logica.main;
import com.logica.clases.EnviarCorreo;
import com.logica.clases.GuardarBaseDatos;
import com.logica.clases.Usuario;

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

    }
}

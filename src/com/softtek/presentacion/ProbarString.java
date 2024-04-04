package com.softtek.presentacion;

public class ProbarString {

    public static void main (String[]args){
        /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */

        String texto="Nunca mates una mosca sobre la cabeza de un tigre.";

        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println(texto.substring(0,5));
        System.out.println(texto.substring(16,21));
        System.out.println(texto.substring(31,37));
        System.out.println(texto.indexOf("m"));
        System.out.println(texto.length());


    }
}

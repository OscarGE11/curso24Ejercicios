package com.softtek.presentacion;

import com.softtek.modelo.Alumno;

public class PruebaAlumnos {
    public static void main (String[]args){

        Alumno alumno1 = new Alumno("Oscar",2);

        alumno1.setCalificacionesParciales(2,1);
        System.out.println(alumno1.mostrarCalificacionesParciales());
    }
}

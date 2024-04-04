package com.softtek.modelo;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Alumno {
    /*
    * EJERCICIO 6
Construir una aplicación que muestre por pantalla el nombre de alumno y su nota final.
Para ello construir una clase Alumno que contenga:
• Un campo que sea una matriz para almacenar las calificaciones de los parciales.
• El constructor deberá inicializar las variables de NombreCompleto y dimensionar
el array de Parciales.
• Una propiedad de escritura para asignar los valores de los parciales.
• Un método para calcular el promedio de los parciales.
• Un método para mostrar las calificaciones de los parciales.*/

    private String nombreCompleto;
    private double[] calificacionesParciales;
    private int cantidadParciales;

    public Alumno (String nombreCompleto,int cantidadParciales){
        this.nombreCompleto=nombreCompleto;
        this.calificacionesParciales=new double[cantidadParciales];

    }

    public Alumno() {
    }

    public void setCalificacionesParciales (double calificaciones,int posicion){
        if(posicion <=calificacionesParciales.length){
            calificacionesParciales[posicion]=calificaciones;
        } else {
            System.out.println("La cantidad de parciales no coincide");
        }
    }

    public double calcularPromedio(){
        double suma = 0;

        for (double calificacion:this.calificacionesParciales
             ) {
            suma+=calificacion;
        }
        return suma / this.calificacionesParciales.length;
    }

    public String mostrarCalificacionesParciales(){
        String texto="Calificaciones del curso \n";
        for (int i=0;i< this.calificacionesParciales.length;i++){
            texto+=("Parcial "+(i+1)+ "="+calificacionesParciales[i])+"\n";
        }

        return texto;

    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double[] getCalificacionesParciales() {
        return calificacionesParciales;
    }
}

package com.softtek.modelo;

public class Tabla {
    /*EJERCICIO 5
Construir una aplicación que imprima por pantalla las tablas de multiplicar. Debe contar
con un constructor que indica la tabla que se va a mostrar. Debe contar con un
método que dé como resultado un string para mostrar diez línea de la tabla del
número dado en el constructor.
*/

    private int numeroTabla;


    public Tabla (int numeroTabla){
        this.numeroTabla=numeroTabla;
    }
    public Tabla (){}

    public String tablaMultiplicar(){
        int numeroTabla= getNumeroTabla();
        String tabla = "";
        for (int i=0;i<=10;i++){

            tabla = tabla + (numeroTabla*i)+"\n";

        }
        return tabla;
    }

    public int getNumeroTabla() {
        return numeroTabla;
    }
}

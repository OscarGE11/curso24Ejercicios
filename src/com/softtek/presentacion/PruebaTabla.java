package com.softtek.presentacion;

import com.softtek.modelo.Tabla;

public class PruebaTabla {
    public static void main(String[] args) {
        Tabla tabla = new Tabla(2);

        System.out.println("Tabla de multiplicar del "+tabla.getNumeroTabla()+"\n"+tabla.tablaMultiplicar());
    }
}

package com.softtek.presentacion;

import com.softtek.modelo.Areas;

public class PruebaArea {
    public static void main(String[] args) {

        Areas primero = new Areas();

        System.out.println(primero.calcularAreaCirculo(2));
        System.out.println(primero.calcularAreaRectangulo(4,5));
    }

}

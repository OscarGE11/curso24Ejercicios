package com.softtek.presentacion;

import com.softtek.modelo.Campos;

public class PruebaCampos {
    public static void main(String[] args) {
        Campos x = new Campos(2);

        System.out.println(x.muestra());
        x.incrementa();
        System.out.println(x.muestra());
    }
}

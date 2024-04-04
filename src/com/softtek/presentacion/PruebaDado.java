package com.softtek.presentacion;

import com.softtek.modelo.Dado;

public class PruebaDado {
    public static void main (String[]args){
        Dado dado = new Dado();

        /*System.out.println("  .  \n     \n");
        System.out.println("     .\n     \n.");
        System.out.println("     .\n  .  \n.");
        System.out.println(".   .\n     \n.   .");
        System.out.println(".   .\n  .  \n.   .");
        System.out.println(".   .\n.   .\n.   .");*/

        System.out.println(dado.dibujarCara());
    }
}

package com.softtek.modelo;

public class Areas {
    /*EJERCICIO 3
Crear la clase Areas con métodos para calcular el área de un circulo y el área de un
rectángulo. Desde una clase principal realizar ambos cálculos y mostrarlos por pantalla.

*/
    // Atributos
    private int radio;
    private int baseRectangulo;
    private int alturaRectangulo;

    public int getAlturaRectangulo() {
        return alturaRectangulo;
    }

    public int getBaseRectangulo() {
        return baseRectangulo;
    }

    public int getRadio() {
        return radio;
    }

    public Areas (int alturaRectangulo, int baseRectangulo, int radio ){
        alturaRectangulo = alturaRectangulo;
        baseRectangulo =baseRectangulo;
        radio = radio;
    }
    public Areas(){}

    public double calcularAreaCirculo(int radio){

        double areaCirculo = Math.pow(radio,2)*Math.PI;

        return areaCirculo;

    }

    public int calcularAreaRectangulo(int baseRectangulo, int alturaRectangulo){
        int areaRectangulo = baseRectangulo*alturaRectangulo;
        return areaRectangulo;
    }




}

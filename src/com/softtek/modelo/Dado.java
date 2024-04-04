package com.softtek.modelo;

public class Dado {

    /*
EJERCICIO 7
Realizar la clase Dado su objetivo será lanzar un dado, mostrando el resultado por
pantalla. Se aconseja estructurar el programa de la siguiente forma. En el main se
invoca a los métodos de la clase dado. Una clase dado, que dispondrá de: Un
constructor que usa el método random de Math multiplicado por (6-1)+1.
La llamada a Math.random() devuelve un número aleatorio entre 0.0 y 1.0, excluido
este último valor, es decir, puede devolver 0.346442, 0.2344234, 0.98345,....
En muchas de nuestras aplicaciones no nos servirá este rango de valores. Por ejemplo,
si queremos simular una tirada de dado, queremos números entre 1 y 6 sin decimales.
Debemos echar unas cuentas para obtener lo deseado.
En primer lugar, miramos cuántos valores queremos. En nuestro caso del dado son 6
valores, del 1 al 6 ambos incluido. Debemos entonces multiplicar Math.random() por 6
(que es (maximo-minimimo)+1, es decir, (6-1)+1)Los métodos serán: Seis para
dibujar por pantalla la imagen de los números. Otro para lanzar(), que generará un
número aleatorio entre 1 y 6, invocará al método dibujar que le corresponda.*/



    public int lanzar() {
        double numeroAleatorio = Math.random() * 6;

        return (int) numeroAleatorio + 1;
    }

public String dibujarCara(){
    int numeroCara= lanzar();
    String texto="";
    switch (numeroCara) {
        case 1: texto = "  .  ";break;
        case 2: texto = "     .\n.";break;
        case 3: texto = "     .\n  .  \n.";break;
        case 4: texto = ".   .\n     \n.   .";break;
        case 5: texto = ".   .\n  .  \n.   .";break;
        case 6: texto = ".   .\n.   .\n.   .";break;
    }

    return texto;
}

public Dado (){

}
}

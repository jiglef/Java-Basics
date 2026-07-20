package com.jiglef;

import com.jiglef.modelo.Gato;
import com.jiglef.modelo.Perro;

public class Main {
    public static void main(String[] args) {

        Perro tobby = new Perro("Tobby", 07, "Yorkie");
        Gato calcetines = new Gato("Calcetines", 2, "Negro");


        tobby.hacerSonido();
        tobby.mostrarDatos();

        calcetines.hacerSonido();
        calcetines.mostrarDatos();

    }
}
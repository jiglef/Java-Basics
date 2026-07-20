package com.jiglef.modelo;

public class Gato extends Animal {

    protected String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El gato maulla");
    }


    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre +
            ", edad: " + edad +
            ", color: " + color);
        }

}


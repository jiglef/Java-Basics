package com.jiglef.modelo;

public class Perro extends Animal {

    protected String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El perro ladra");
    }


   @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre +
                ", edad: " + edad +
                ", raza: " + raza);
    }




}

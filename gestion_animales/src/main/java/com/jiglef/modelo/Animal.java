package com.jiglef.modelo;

public class Animal {

    protected String nombre;
    protected int edad;

    public Animal (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){

    }

    public void hacerSonido(){
        System.out.println("Este animal hace: ");
    }



}

package com.jiglef;

public class Alumnos {

    String nombre;
    int edad, notaFinal;

    public Alumnos (String nombre, int edad, int notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;

    }

    @Override
    public String toString() {
        return "Nombre del alumno " + nombre + ", edad " + edad + ", nota final del curso " + notaFinal;
    }

    public boolean estaAprobado (Alumnos alumno) {
        if (alumno.notaFinal >= 5) {
            return true;
        }

        return false;

    }



}

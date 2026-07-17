package com.jiglef;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Alumnos[] alumnos = altaAlumnos();
        mostrarAlumnos(alumnos);
        System.out.println("Total de aprobados: " + totalAprobados(alumnos));
        System.out.println("El mejor alumno es: " + mayorNota(alumnos));


    }


    public static Alumnos[] altaAlumnos() {

        Alumnos [] alumnos = new Alumnos[3];
        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < alumnos.length; i++) {

            System.out.print("Introduce el nombre del alumno: ");
            String nombre = teclado.nextLine();

            System.out.print("Introduce la edad: ");
            int edad = Integer.parseInt(teclado.nextLine());

            System.out.print("Introduce la nota final del curso: ");
            int notaFinal = Integer.parseInt(teclado.nextLine());

            Alumnos alumno = new Alumnos(nombre, edad, notaFinal);
            alumnos[i] = alumno;



        }
        teclado.close();

        return alumnos;


    }


    public static void mostrarAlumnos (Alumnos alumnos[]) {
        System.out.println("Total de alumnos");
        for (Alumnos alumno : alumnos) {
            System.out.println(alumno.toString());

        }

    }

    public static int totalAprobados(Alumnos alumnos[]) {
        int aprobado = 0;
        for (Alumnos alumno : alumnos) {
            if(alumno.estaAprobado(alumno)){
                aprobado ++;
            }
        }
        return aprobado;
    }


    public static String mayorNota(Alumnos alumnos[]) {
        int notaAux = 0;
        Alumnos alumnoMayor = null;

        for (Alumnos alumno : alumnos) {
            if (alumno.notaFinal > notaAux) {
                notaAux = alumno.notaFinal;
                alumnoMayor = alumno;
            }
        }

        return alumnoMayor.nombre;
    }
}






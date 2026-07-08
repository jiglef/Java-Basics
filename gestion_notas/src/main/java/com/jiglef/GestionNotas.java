package com.jiglef;

import java.util.Scanner;

public class GestionNotas {

    public static void main(String[] args) {

        int alumnos, nota, aprobados = 0, suspensos = 0, total = 0, alta = 0, baja = 10;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuantos alumnos quieres evaluar? ");
        alumnos = Integer.parseInt(teclado.nextLine());


        for (int i = 0; i < alumnos; i++) {
            System.out.print("Introduce la nota para el alumno " + (i+1) + ": ");
            nota = Integer.parseInt(teclado.nextLine());

            total += nota;

            if (nota >= 5) {
                aprobados += 1;
            } else {
                suspensos += 1;
            }

            if (nota > alta) {
                alta = nota;
            }

            if (nota < baja) {
                baja = nota;
            }

        }


        System.out.println("Este es el número total de aprobados: " + aprobados);
        System.out.println("Este es el número total de suspensos: " + suspensos);
        System.out.println("Esta es la nota media de los alumnos evaluados: " + (double) total/alumnos);
        System.out.println("Esta es la nota mas alta: " + alta + " y esta es la nota mas baja: " + baja);



















        teclado.close();

    }




}
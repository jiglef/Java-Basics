package com.jiglef;

import java.util.Scanner;

public class MenuCalculadora {


    static Scanner teclado = new Scanner(System.in); //valido para toda la clase
    public static void main(String[] args) {



        int opcion;

        do {

            System.out.println("""
                Elige la opción que desees ejecutar:
                1- Sumar
                2- Restar
                3- Multiplicar
                4- Dividir
                5- Salir

                    """);

            System.out.println("¿Que opción deseas?");
            opcion = Integer.parseInt(teclado.nextLine());


            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    break;
                default: System.out.println("Opción no valida");
                    break;
        }

        } while (opcion != 5);
        System.out.println("¡Hasta luego!");


    }

    public static int pedirDatos() {
        System.out.println("Introduce el numero: ");
        int numero = Integer.parseInt(teclado.nextLine());

        return numero;

    }

      public static void sumar() {

        int n1 = pedirDatos();
        int n2 = pedirDatos();

        System.out.println("Este es el resultado de la operacion: " + (n1 + n2));

    }


    public static void restar() {

        int n1 = pedirDatos();
        int n2 = pedirDatos();

        System.out.println("Este es el resultado de la operacion " + (n1 - n2));

    }

      public static void multiplicar() {

        int n1 = pedirDatos();
        int n2 = pedirDatos();


        System.out.println("Este es el resultado de la operación: "+ (n1 * n2));

    }

     public static void dividir() {

        int n1 = pedirDatos();
        int n2 = pedirDatos();

        if (n2 == 0) {
            System.out.println("No es posible dividir entre 0");
        } else {
            System.out.println("Este es el resultado de la división: " + (n1/n2));
        }


    }

}
package com.jiglef;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String palabras[] = introducirPalabras();
        System.out.println("Palabras introducidas");
        mostrarPalabras(palabras);
        System.out.println("Longitud de cada palabra");
        mostrarLongitud(palabras);
        System.out.println("Estas son las palabras con mas de 5 caracteres: " + masCinco(palabras));
        System.out.println("Palabras más larga ");
        palabraLarga(palabras);


    }

        public static String[] introducirPalabras() {
            String palabras [] = new String [5];
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce 5 palabras para rellenar el array ");
            for (int i = 0; i < palabras.length; i++) {
                System.out.print("Introduce la palabra: ");
                String palabra = teclado.nextLine();

                palabras[i] = palabra;
            }

            teclado.close();

            return palabras;
        }


        public static void mostrarPalabras (String [] palabras) {
            for (int i = 0; i < palabras.length; i++) {
                System.out.println(palabras[i]);
            }
        }

        public static void mostrarLongitud (String [] palabras) {
            for (int i = 0; i < palabras.length; i++) {
                System.out.println(palabras[i] + " -- longitud: " + palabras[i].length() + " caracteres");
             }
        }

        public static int masCinco (String [] palabras) {
            int masCinco = 0;
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].length() > 5) {
                    masCinco +=1;
                }
            }
            return masCinco;

        }


        public static void palabraLarga(String[] palabras) {
        int mayorTamaño = 0;
        String palabraMayor = "";
        for (int i = 0; i < palabras.length; i++) {
            if(mayorTamaño < palabras[i].length()) {
               mayorTamaño = palabras[i].length();
               palabraMayor = palabras[i];
              }


        }

        System.out.println(palabraMayor);

    }
}
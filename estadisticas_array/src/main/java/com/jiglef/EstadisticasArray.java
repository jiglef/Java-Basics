package com.jiglef;

import java.util.Scanner;

public class EstadisticasArray {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int[] numeros = introducirDatos();
        System.out.println("Estos son los datos introducidos ");
        mostrarDatos(numeros);
        System.out.println();
        System.out.println("Este es el valor de la suma de los valores: " + sumaTotal(numeros));
        System.out.println("Es el es valor de la media de los datos introducidos: " + media(numeros));
        System.out.println("Este es la cantidad de números pares introducidos: " + numerosPares(numeros));
        System.out.println("Este es la cantidad de números impares introducidos: " + numerosImpares(numeros));
        System.out.println("Este es el número mayor de los introducidos: " + numeroMayor(numeros));
        System.out.println("Este es el número menor de los introducidos: " + numeroMenor(numeros));



    }

    public static int[] introducirDatos(){
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número en el array: ");
            int numero = Integer.parseInt(teclado.nextLine());
            numeros[i] = numero;// la variable de la izquierda recibe el valor de la derecha

        }

        return numeros;

    }

    public static void mostrarDatos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "  ");
        }
    }

    public static int sumaTotal (int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma;
    }

    public static double media (int[] numeros) {
        double media = (double) sumaTotal(numeros)/numeros.length;

        return media;
    }

    public static int numerosPares (int[] numeros) {
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2 == 0){
                pares +=1;
            }
        }

        return pares;
    }

    public static int numerosImpares (int[] numeros) {
        int impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 != 0){
                impares +=1;
            }
        }

        return impares;
    }

    public static int numeroMayor (int[] numeros) {
        int auxiliarMayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(auxiliarMayor < numeros[i]) {
                auxiliarMayor = numeros[i];
            }
        }

        return auxiliarMayor;
    }

     public static int numeroMenor (int[] numeros) {
        int auxiliarMenor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(auxiliarMenor > numeros[i]) {
                auxiliarMenor = numeros[i];
            }
        }

        return auxiliarMenor;
    }
}
package com.jiglef;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        static Scanner teclado = new Scanner(System.in);
        static ArrayList<Pelicula> peliculas = new ArrayList<>();
    public static void main(String[] args) {



        int opcion;


        do{
            System.out.println("""
                Opciones disponibles:
                1 - Registrar peliculas
                2 - Mostrar catalogo
                3 - Mostrar peliculas recomendadas
                4 - Buscar peliculas por titulo
                5 - Mostrar pelcula mejor valorada
                6 - Calcular duracion media
                7 - Salir

                    """);

            System.out.print("¿Que deseas realizar? ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch(opcion) {
                case 1://registrar peliculas
                        registrarPeliculas();
                    break;
                case 2://mostrar catalogo
                        mostrarCatalogo(peliculas);
                    break;
                case 3://mostrar recomendadas
                        peliculasRecomendadas(peliculas);
                    break;
                case 4://buscar pelicula por titulo
                        buscarPelicula(peliculas);
                    break;
                case 5://mostrar peliculas mejor valorada
                        mejorValorada(peliculas);
                    break;
                case 6://duracion media
                        duracionMedia(peliculas);
                    break;
                case 7://salir
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        }while(opcion !=7);
            System.out.println("¡Hasta luego!");

    }

    public static void registrarPeliculas() {
        System.out.print("Introduce el nombre de la pelicula: ");
        String nombre = teclado.nextLine();

        System.out.print("¿De que genero es? ");
        String genero = teclado.nextLine();

        System.out.print("¿Cual es la duracion de la pelicula?");
        int duracion = Integer.parseInt(teclado.nextLine());

        System.out.print("Puntuación: ");
        double puntuacion = Double.parseDouble(teclado.nextLine());

        Pelicula pelicula = new Pelicula(nombre, genero, duracion, puntuacion);

        peliculas.add(pelicula);
    }

    public static void mostrarCatalogo(ArrayList<Pelicula> peliculas) {
        if (!peliculas.isEmpty()) {
            System.out.println("Lista de peliculas: ");
            for (Pelicula pelicula : peliculas) {

                System.out.println(pelicula.toString());
            }
        } else {
            System.out.println("La lista de peliculas esta vacía");
        }
    }

    public static void peliculasRecomendadas(ArrayList<Pelicula> peliculas){
        if(!peliculas.isEmpty()) {
            System.out.println("-- Peliculas recomendadas --");
            for (Pelicula pelicula : peliculas) {
                if (pelicula.estaRecomendada()){

                    System.out.println(pelicula.getTitulo());
                }


            }
        } else {
            System.out.println("No te puedo recomendar nada, no hay peliculas registradas");
        }
    }

    public static void buscarPelicula(ArrayList<Pelicula> peliculas) {
           if (!peliculas.isEmpty()) {
                System.out.print("Introduce el nombre de la peli a buscar: ");
                String nombre = teclado.nextLine();

                boolean encontrada = false;

                for (Pelicula pelicula : peliculas) {
                    if (pelicula.getTitulo().equalsIgnoreCase(nombre)) {
                        System.out.println(pelicula);
                        encontrada = true;
                        break;
                    }
                }

                if (!encontrada) {
                    System.out.println("Película no encontrada");
                }

            } else {
            System.out.println("La lista está vacía");
            }
    }


    public static void mejorValorada(ArrayList<Pelicula> peliculas) {
        double puntuacionAuxiliar = 0;
        Pelicula peliculaMayorPuntuacion = null;

        if(!peliculas.isEmpty()) {

            for (int i = 0; i < peliculas.size(); i++) {
                if(puntuacionAuxiliar < peliculas.get(i).getPuntuacion()) {
                    puntuacionAuxiliar = peliculas.get(i).getPuntuacion();
                    peliculaMayorPuntuacion = peliculas.get(i);

                }


            }
            System.out.println(peliculaMayorPuntuacion);
        } else {
            System.out.println("La lista esta vacia");
        }


    }

    public static void duracionMedia(ArrayList<Pelicula> peliculas){
        double duracionTotal = 0;

        if(!peliculas.isEmpty()) {
            for (Pelicula pelicula : peliculas) {
                duracionTotal += pelicula.getDuracion();

            }

            System.out.println("Esta es la duración media de las peliculas: " + (duracionTotal/peliculas.size()));
        }
        else {
            System.out.println("La lista esta vacia");
        }
    }



}
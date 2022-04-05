/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.villcajaitalfernando.ordenaralumnos;

/**
 *
 * @author Centro Virtual
 */
public class Ordenaralumnos {
    
    public static void main(String[] args) {
        Alumno[] listaAlumnos = new Alumno[10];
        String[] nombres = {"Angelica", "Samuel", "Teresa", "Isaura", "Juan", "Fernando"};
        String[] apellidos = {"Linares", "Vilchez", "Jimenez", "Irusta", "Cardenas", "Guzman"};

        for (int i = 0; i < 10; i++) {
            String nom = nombres[(int) (Math.random() * 5)];
            String ape = apellidos[(int) (Math.random() * 5)];
            int numero = (int) (Math.random() * 101);
            String cu = "111-" + String.valueOf(numero);

            listaAlumnos[i] = new Alumno(nom, ape, cu, Carrera.Sistemas);

            System.out.println(listaAlumnos[i]);
        }
        Alumno auxiliar = new Alumno();
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (listaAlumnos[i].getApellidos().compareTo(listaAlumnos[j].getApellidos()) > 0) {
                    auxiliar.setNombres(listaAlumnos[i].getNombres());
                    auxiliar.setApellidos(listaAlumnos[i].getApellidos());
                    auxiliar.setCU(listaAlumnos[i].getCU());
                    
                    listaAlumnos[i].setNombres(listaAlumnos[j].getNombres());
                    listaAlumnos[i].setApellidos(listaAlumnos[j].getApellidos());
                    listaAlumnos[i].setCU(listaAlumnos[j].getCU());
                    
                    listaAlumnos[j].setNombres(auxiliar.getNombres());
                    listaAlumnos[j].setApellidos(auxiliar.getApellidos());
                    listaAlumnos[j].setCU(auxiliar.getCU());
                    
                    
                }
            }
        }
        System.out.println("\n LISTA ORDENADA");
        for (Alumno a:listaAlumnos)
        {
            System.out.println(a);
        }

    }
}

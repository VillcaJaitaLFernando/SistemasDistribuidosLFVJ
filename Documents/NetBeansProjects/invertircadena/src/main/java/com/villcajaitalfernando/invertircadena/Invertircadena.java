/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.villcajaitalfernando.invertircadena;

import java.util.Scanner;

/**
 *
 * @author Centro Virtual
 */
public class Invertircadena {

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena para invertirla");
        Scanner cad = new Scanner(System.in);
        String cadena = cad.nextLine();
		// inicializamos la variable cadena invertida
		String invertida = "";
		// ciclo para recorrer la cadena
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			invertida += cadena.charAt(indice);
		}
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);
    }
}

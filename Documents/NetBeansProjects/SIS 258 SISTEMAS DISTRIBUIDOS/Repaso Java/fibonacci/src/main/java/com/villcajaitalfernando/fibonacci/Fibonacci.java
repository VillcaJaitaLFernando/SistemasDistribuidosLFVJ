/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.villcajaitalfernando.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Centro Virtual
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Fibonacci de un Numero:");
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduzca el numero del cual desea calcular el Fibonacci:");
        int n = sn.nextInt();
        operacion o=new operacion(n);
        System.out.println("El Fibonacci de "+n+" es:"+o.calcularFibo());
    }
}

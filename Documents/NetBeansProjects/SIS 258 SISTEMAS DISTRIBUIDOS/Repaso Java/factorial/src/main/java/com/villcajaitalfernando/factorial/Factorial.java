/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.villcajaitalfernando.factorial;

import java.util.Scanner;

/**
 *
 * @author Centro Virtual
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial de un Numero:");
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduzca el numero del cual desea calcular el Factorial:");
        int n = sn.nextInt();
        Operacion o=new Operacion(n);
        System.out.println("El Factorial de "+n+" es:"+o.calcularFactorial());
    }
    
    
}

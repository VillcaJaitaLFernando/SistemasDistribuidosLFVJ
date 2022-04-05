/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.villcajaitalfernando.factorial;

/**
 *
 * @author Centro Virtual
 */
public class Operacion {
    int n;

    public Operacion(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int calcularFactorial()
    {
        return factorial(this.n);
    }
    
    private int factorial( int n ) {
      int fact = 1;
      for( int i = 1; i <= n; i++ ) {
         fact *= i;
      }
 
      return fact;
    }
}

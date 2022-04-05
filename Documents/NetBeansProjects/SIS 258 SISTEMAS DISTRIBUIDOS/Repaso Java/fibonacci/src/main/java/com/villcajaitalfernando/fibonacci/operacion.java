/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.villcajaitalfernando.fibonacci;

/**
 *
 * @author Centro Virtual
 */
public class operacion {
    int n;

    public operacion(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int calcularFibo()
    {
        return fibonacci(this.n);
    }
    
    private int fibonacci( int n ) {
        if (n>1){
       return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
        else if (n==1) {  
        return 1;
        }
             else if (n==0){  
            return 0;
            }
                    else{ //error
                        System.out.println("Debes ingresar un numero mayor o igual a 1");
                        return -1; 
                    }
    }
}

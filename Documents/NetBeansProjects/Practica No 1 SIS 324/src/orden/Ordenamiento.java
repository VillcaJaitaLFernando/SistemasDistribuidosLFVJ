/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orden;

import java.util.Arrays;

/**
 *
 * @author Centro Virtual
 */
public class Ordenamiento {
    private int a;
    private int b;
    private int c;

    public Ordenamiento(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String ordenarSimple(){    
        String ordenado="";
        if (a<b) {
            if (b<c)  {
                ordenado = a + " "+ b+" "+c;
            }
            else {
                if (c<a) ordenado = c + " "+a+" "+b;
                else  ordenado = a + " "+c+" "+b;
             }
            } else {
                if (a<c) ordenado = b + " "+a+" "+ c;
                else  {
                    if (c<b) ordenado = c + " "+ b +" "+ a;                      
                    else ordenado= b+" "+c+" "+a;
                }
    }  
    return ordenado;
    }   
    
    public String ordenarIntercambio(){
    String ordenado="";
        int aux;
        if (a>b) {
            aux=a; a=b; b=aux; }

        if (a>c) {
            aux=a; a=c; c=aux; }

        if (b>c) {
            aux=b; b=c; c=aux; }
        ordenado = a+" "+b+" "+c;
        return ordenado;
    }
    
    public String ordenarArray(){
        String ordenado="";
        int vec[] = {a,b,c};
        int i,j,aux;
        // ordenar el arreglo
        for (i = 1; i < 3; i++){
        aux = vec[i];
        j = i - 1;
        while ( (j >= 0) && vec[j] > aux )
        vec[j+1] = vec[j--];
        vec[j+1] = aux;
    }
        ordenado = vec[0]+" "+vec[1]+" "+vec[2];
        return ordenado;
    }
}

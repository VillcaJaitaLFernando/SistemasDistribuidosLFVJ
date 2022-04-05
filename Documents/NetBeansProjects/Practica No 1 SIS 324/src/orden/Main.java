/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orden;

 //@author Villca Jaita Lino Fernando
public class Main {
    public static void main(String[] args) {
        //ordenamiento por Condiciones simples
        String ordenado;
        Ordenamiento s= new Ordenamiento(4,3,5);
        ordenado=s.ordenarSimple();
        System.out.println(ordenado);
        
        //ordenamiento por Intercambio
        s= new Ordenamiento(7, 11, 4);
        ordenado=s.ordenarIntercambio();
        System.out.println(ordenado);
        
        //Ordenamiento por Array
        int x=12, y=10, z=11;
        Ordenamiento a1 = new Ordenamiento(x,y,z);
        ordenado = a1.ordenarArray();
        System.out.println(ordenado);     
    }
}

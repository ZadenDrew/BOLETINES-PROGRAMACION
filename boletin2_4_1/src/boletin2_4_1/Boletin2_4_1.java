/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4_1;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Boletin2_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          float n1,n2,suma,resta,producto,cociente;
         Scanner leer= new Scanner (System.in);
         System.out.println("Introduce operando1:");
         n1=leer.nextFloat();
         System.out.println("Introduce operando2:");
         n2=leer.nextFloat();   
         System.out.println("suma="+(n1+n2)+"\nresta="+(n1-n2)+"\nproducto="+(n1*n2)+"\ncociente="+(n1/n2));
    }
    
}

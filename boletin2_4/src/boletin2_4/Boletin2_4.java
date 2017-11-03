/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1,num2,suma,resta,producto,cociente;
         Scanner leer= new Scanner (System.in);
         System.out.println("Introduce operando1:");
         num1=leer.nextFloat();
         System.out.println("Introduce operando2:");
         num2=leer.nextFloat();
         suma=num1+num2;
         resta=num1-num2;
         producto=num1*num2;
         cociente=num1/num2;
         System.out.println("suma="+suma+"\nresta="+resta+"\nproducto="+producto+"\ncociente="+cociente);
    }
    
}

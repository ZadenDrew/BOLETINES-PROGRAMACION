/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            float b100,b20,b5,m1,euros;
         Scanner leer= new Scanner (System.in);
         System.out.println("Introduce nº de billetes de 100:");
         b100=leer.nextFloat();
         System.out.println("Introduce nº de billetes de 20:");
         b20=leer.nextFloat();
         System.out.println("Introduce nº de billetes de 5:");
         b5=leer.nextFloat();
         System.out.println("Introduce nº de moedas de 1:");
         m1=leer.nextFloat();
         euros=(b100*100)+(b20*20)+(b5*5)+(m1*1);
         System.out.println("Total = "+euros);
         System.out.println("Os billetes de 100 son:"+b100);
         System.out.println("Os billetes de 20 son:"+b20);
         System.out.println("Os billetes de 5 son:"+b5);
         System.out.println("Os moedas 1 son:"+m1);

    }
    
}

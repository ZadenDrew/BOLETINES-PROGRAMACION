/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int b100,r100,b20,r20,b5,r5,m1,euros;
         Scanner leer= new Scanner (System.in);
         System.out.println("Introduce euros para cambio:");
         euros =leer.nextInt();
         b100 = euros/100;
         r100 = euros % 100;
         b20 = r100/20;
         r20 = r100 % 20;
         b5 = r20 /5;
         r5 = r20 % 5;
         m1 =r5 /1;
         System.out.println("Os billetes de 100 son:"+b100);
         System.out.println("Os billetes de 20 son:"+b20);
         System.out.println("Os billetes de 5 son:"+b5);
         System.out.println("Os moedas 1 son:"+r5);
    }
    
}

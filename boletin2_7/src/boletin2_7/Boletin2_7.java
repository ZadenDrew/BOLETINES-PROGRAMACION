/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float K,F,C;
         Scanner leer= new Scanner (System.in);
         System.out.println("Introduce os grados centígrados:");
         C=leer.nextFloat();
        K= C +273;
        F= (float) (32+(1.8*C));
         System.out.println("Os grados Kelvin son ="+K+"\nOs grados Fahrenheit son ="+F);
    }
    
}

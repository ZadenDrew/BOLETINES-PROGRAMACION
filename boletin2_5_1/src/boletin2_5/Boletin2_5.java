/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         float M=1852f,millas,metros;
         Scanner leer= new Scanner (System.in);
         System.out.println("Introduce millas:");
         millas=leer.nextFloat();
         System.out.println(millas+"millas son"+millas*M+"metros");
        
    }
    
}

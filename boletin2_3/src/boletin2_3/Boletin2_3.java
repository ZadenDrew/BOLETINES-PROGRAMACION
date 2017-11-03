package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Boletin2_3 {
//float cambio=1.1732f;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer= new Scanner (System.in);
            float cambio,euros,dolares;
            System.out.println("Introduce euros:");
            euros=leer.nextFloat();
            System.out.println("Introduce cambio:");
            cambio = leer.nextFloat();
            dolares = euros*cambio;
            System.out.println(euros+"euros son"+dolares+"dolares");
            
                    
    }
    
}

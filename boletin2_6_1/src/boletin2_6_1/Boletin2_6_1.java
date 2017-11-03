package boletin2_6_1;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Boletin2_6_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float pp,pt,porcentaxe;
     Scanner leer = new Scanner (System.in);
     System.out.println("Introduce precio pagado:");
     pp=leer.nextFloat();
     System.out.println("Introduce precio tarifa:");
     pt=leer.nextFloat();
     System.out.println("O desconto foi do"+(100-(pp*100/pt))+"%");
    }
    
}

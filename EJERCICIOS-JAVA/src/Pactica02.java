/*
 * @author Luis
 */

// Ticket de Factura

import java.util.*;
public class Pactica02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double precios[] = new double[50];
        double precio = 0;
        final int  VALORMAX = 50;
        int i=0;
        double total=0;
        double subtotal=0;
        
        System.out.println("     Caja registradora      ");
        System.out.println("============================");
        
        for (i=0; i<precios.length; i++ ){
            
            System.out.println("Precio " + (i+1) + ": ");
            precio = entrada.nextDouble();
            
            if (precio<=0){
                 break;
             }
                
             if (subtotal > VALORMAX && i > 0){
                 precio=precio*0.9;
             }
            
             precios[i]=precio;
             subtotal= subtotal+precio;    
        }
        
        
        i=0;
            
        System.out.println("============================");
        System.out.println("      Ticket de Compra");
        System.out.println("============================");
        
        while (i< precios.length && precios[i]>0){
            System.out.println(precios[i]);
            total = total + precios[i];
            i++;
        }
        System.out.println("Total a pagar: " + total + " €.");
        System.out.println("Gracias por la compra.");

    }

}

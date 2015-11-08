/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author Cristian Torres
 */
public class RESTA {
        public static void main(String[] args) {
            Scanner tecla = new Scanner(System.in);
            float a ,b;
            System.out.println("Numero1= ");
            a= tecla.nextFloat();
            System.out.println("Numero2= ");
            b= tecla.nextFloat();
     float suma= a-b;
            System.out.println("La resta es: "+ suma);            
            
            
            
    }
    
}

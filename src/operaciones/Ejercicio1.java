/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author Junior
 */
public class Ejercicio1 {

    public static void main(String[] args) 
    {        
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número entero:");
        numero = sc.nextInt();
        System.out.println("Número introducido: " + numero);
        System.out.println("Doble de " + numero + " -> "+ 2*numero);
        System.out.println("Triple de " + numero + " -> "+ 3*numero);
        System.out.println("Cuarto de " + numero + " -> "+ 4*numero);
        System.out.println("Quinto de " + numero + " -> "+ 5*numero);
    }

}

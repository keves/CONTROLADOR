/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class multiplicacion {
    public static void main(String[] args) {
        float x,y,z;
        
        Scanner taclado= new Scanner(System.in);
        System.out.print("Num1:");
        x=Float.valueOf(taclado.nextLine());
        System.out.print("Num2:");
        y=Float.valueOf(taclado.nextLine());
        z=x*y;
        System.out.println("Total:" + z);
        
    }
}

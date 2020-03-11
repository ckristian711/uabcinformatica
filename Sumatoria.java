/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;

import java.util.Scanner;

/**
 *
 * @author clases
 */
public class Sumatoria {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       int n, suma = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Cuantos numeros quieres sumar?");
        n = s.nextInt();
        int []a = new int[n];
        System.out.println("Digita todos los numeros que vayas a sumar:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            suma = suma + a[i];
            
            
        }
        System.out.println("");
         for (int element: a) {
            System.out.println(element);
        }
     
     
       
        
        System.out.println("-----------");
        System.out.println(suma);
    }
}

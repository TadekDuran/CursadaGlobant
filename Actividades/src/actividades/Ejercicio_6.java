/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author Dana
 */
public class Ejercicio_6 {
    
    //Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
    //alguno de ellos es mayor a 25.
    
    Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número entero.");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número entero.");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) { 
            System.out.println("Ambos números son mayores a 25");  
        } else if(num2 > 25 || num1 > 25 ) { 
            System.out.println("Al menos un número es mayor a 25");        
            } else {
            System.out.println("Ningún número es mayor a 25");   }
        }
    
    
}

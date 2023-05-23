/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

/**
 *
 * @author Dana
 */
public class Ejercicio_10 {
    
    //Ejercicio 10:
       /* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
        ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **    
        */
        
    System.out.println("Ingrese el primer número.");
        int num1 = leer.nextInt();
        
    System.out.println("Ingrese el segundo número.");
        int num2 = leer.nextInt();
        
    System.out.println("Ingrese el tercer número.");
        int num3 = leer.nextInt();  
        
    System.out.println("Ingrese el cuarto número.");  
        int num4 = leer.nextInt(); 
        
            
    for (int i = 0; i < num1; i++) {
        if (i != 0) {
        System.out.print("*");
            } else {
        System.out.print(num1 + " *");    
        }    
    }   System.out.println("");
        
    for (int i = 0; i < num2; i++) {
        
        if (i != 0) {
        System.out.print("*");
            } else {
        System.out.print(num2 + " *");    
        }
    }   System.out.println(""); 
       
    for (int i = 0; i < num3; i++) {
        
        if (i != 0) {
        System.out.print("*");
            } else {
        System.out.print(num3 + " *");    
        }
    }   System.out.println(""); 
    
    for (int i = 0; i < num4; i++) {
        
        if (i != 0) {
        System.out.print("*");
            } else {
        System.out.print(num4 + " *");    
        }    
    }   System.out.println("");
    
}

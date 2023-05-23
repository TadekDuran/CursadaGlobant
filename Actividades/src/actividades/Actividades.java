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
public class Actividades {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Ejercicio 12:
       /* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
        que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
        segundo, sino informe que no lo son.
        */
    
            System.out.println("Ingrese el primer número para saber si el segundo es su múltiplo.");
            int num1 = leer.nextInt();
            
            System.out.println("Ingrese el segundo número para saber si es múltiplo del primero");
            int num2 = leer.nextInt();         
    }
    
    public static void EsMultiplo (int num1, int num2)   {
        
        if (num2 % num1 == 0)    {
            System.out.println("El número " + num1 + " es múltiplo de " + num2);
        }   else    {
            System.out.println("El número " + num1 + " NO es múltiplo de " + num2);            
        }        
    }
}


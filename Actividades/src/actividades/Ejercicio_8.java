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
public class Ejercicio_8 {
    
    //Ejercicio 8:
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
        //pedirá de nuevo hasta que la nota sea correcta.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la nota entre 0 y 10");
        int nota = leer.nextInt();
        
        while(nota > 10 || 0 > nota ) {
            
            System.out.println(nota + " no es un número válido, intente nuevamente.");
            nota = leer.nextInt();
            }
    
}

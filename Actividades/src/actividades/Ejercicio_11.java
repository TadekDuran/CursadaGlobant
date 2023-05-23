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
public class Ejercicio_11 {
        
        Scanner leer = new Scanner(System.in);
        //Ejercicio 11:
       /* Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
        en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
        reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
        vocales acentuadas) se mantienen sin cambios.
        a e i o u
        @ # $ % *
        */
        System.out.println("Ingrese la frase que desea codificar");
        String frase = leer.nextLine();
        
        
        System.out.println(codificarFrase(frase));
    
    }
    
    public static String codificarFrase (String frase)  {
        
        String nuevaFrase = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
            String letra = frase.substring(i, i + 1);
            
            switch(letra)   {
                case "a":
                case "A":
                    letra = "@";
                    break;
                case "e":
                case "E":
                    letra = "#";
                    break;
                case "i":
                case "I":
                    letra = "$";
                    break;
                case "o":
                case "O":
                    letra = "%";
                    break;
                case "u":
                case "U":
                    letra = "*";
                    break;
                default:
                    letra = letra;
                    break;        
            }
            
            nuevaFrase = nuevaFrase.concat(letra);
            
        }
        
        
        
        return nuevaFrase;
    }
    
    
}

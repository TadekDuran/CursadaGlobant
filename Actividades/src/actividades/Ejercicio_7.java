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
public class Ejercicio_7 {
    
    Scanner leer = new Scanner(System.in);
   // Ejercicio 7:     
 //Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
//que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
//permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
///o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
//o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
//gasolina”.
//o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
//hormigón”.
//o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
//alimenticia”.
//o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
//válido para tipo de bomba”
        
        System.out.println("Ingrese una opción del 1 al 4.");
        int tipoMotor = leer.nextInt();
        
        switch(tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe bomba asignada al valor ingresado.");
            }
        }
    
}

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
public class Ejercicio_9 {
    
    Scanner leer = new Scanner(System.in);
        //Ejercicio 9:
        //Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
        //bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
        //resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
        //Nota: recordar el uso de la sentencia break.
        
        int contador = 1;
        
        System.out.println("Ingrese un número entero.");
            int num = leer.nextInt();
            int suma = num;
        do  {
            System.out.println("Ingrese otro número entero.");
            num = leer.nextInt();
            contador = contador + 1;
        if (num != 0) {
            suma = suma + num;
        } else {
            suma = suma + num;
            break;
            }
        } while(contador < 20);
        
        if (num != 0) {
            System.out.println("La sumatoria total dió: " + suma);
        }   else    {
            System.out.println("La sumatoria total dió: " + suma + " y se tomaron " + contador + " números.");
        }
    
}

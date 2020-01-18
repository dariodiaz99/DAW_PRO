/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirlaflota;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class HundirLaFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Menu del juego
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) { //Mientras sea distinto a salir hacer lo siguiente
            
            System.out.println("Escribe una de las opciones a elegir");
            
            System.out.println("1. Insertar Barco 1 (Tamaño: 1)");
            System.out.println("2. Insertar Barco 2 (Tamaño: 2)");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado el 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado el 2");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                //ponemos excepcion para que no exista problemas con una 
                //cadena y sea obligado utilizar numeros.
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
}
 

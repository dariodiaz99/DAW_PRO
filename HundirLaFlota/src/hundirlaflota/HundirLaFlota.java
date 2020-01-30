/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirlaflota;

import java.util.InputMismatchException;
import java.util.Random;
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
        
        Jugador jugador1 = new Jugador();
        Jugador jugadorEnemigo = new Jugador();
        
        Barco barco1 = new Barco();
        
        Tablero tablero = new Tablero();
        Tablero tableroEnemigo = new Tablero();
        //jugadorIA.mostrarTablero();
        
        // Menu del juego
        System.out.println("Bienvenido al Juego de hundir la flota");
        Random rnd = new Random();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        
        int opcion;
        boolean lanchita1 = false;//Guardaremos la opcion del usuario
        boolean submarinito = false;
        boolean buquito = false;
        boolean Portamosquitos = false;
        
        while (!salir) { //Mientras sea distinto a salir hacer lo siguiente
            
            System.out.println("Escribe una de las opciones a elegir");
            
            System.out.println("1. Crear Tableros/Mapas");
            System.out.println("2. Insertar Lancha (Tamaño / casillas a ocupar 1)");
            System.out.println("3. Insertar Submarino (Tamaño / casillas a ocupar 3)");
            System.out.println("4. Insertar Buque (Tamaño / casillas a ocupar 4)");
            System.out.println("5. Insertar PortaAviones (Tamaño / casillas a ocupar 5)");
            System.out.println("6. Disparar");
            System.out.println("7. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                
                
                switch (opcion) {
                    
                    case 1:
                            System.out.println("Has seleccionado el 1");
                            tablero.crearTablero();
                            
                            System.out.print("\n" + "Tablero enemigo" + "\n");
                            tableroEnemigo.crearTableroEnemigo();
                            break;
                
                    case 2:
                        if (!lanchita1) {
                            lanchita1 = true;
                            System.out.println("Has seleccionado el 2");
                            //FALTA COLOCAR EL BARCO PARA QUE FUNCIONE
                            barco1.colocarLancha(sn, tablero);
                            tablero.mostrarTablero();
                        
                            System.out.print("\n" + "Tablero enemigo" + "\n");
                            barco1.colocarLanchaEnemigo(rnd, tableroEnemigo);
                            tableroEnemigo.mostrarTableroEnemigo();
                        }else{
                            System.out.println("Solo puedes poner un barco de 1 Casilla");
                        }
                        
                        break;
                    case 3:
                        if (!submarinito) {
                            
                            submarinito = true;
                            System.out.println("Has seleccionado el 3");
                            //FALTA COLOCAR EL BARCO PARA QUE FUNCIONE
                            barco1.colocarSubmarino(sn, tablero);
                            tablero.mostrarTablero();
                        
                            System.out.print("\n" + "Tablero enemigo" + "\n");
                            barco1.colocarSubmarinoEnemigo(rnd, tableroEnemigo);
                            tableroEnemigo.mostrarTableroEnemigo();
                        
                        }else{
                            
                            System.out.println("Solo puedes poner un barco de 3 Casillas");
                        
                        }
                        
                        break;
                    case 4:
                        if (!buquito){
                            buquito = true;
                            System.out.println("Has seleccionado el 4");
                            //FALTA COLOCAR EL BARCO PARA QUE FUNCIONE
                            barco1.colocarBuque(sn, tablero);
                            tablero.mostrarTablero();
                        
                            System.out.print("\n" + "Tablero enemigo" + "\n");
                            barco1.colocarBuqueEnemigo(rnd, tableroEnemigo);
                            tableroEnemigo.mostrarTableroEnemigo();
                        }else{
                            System.out.println("Solo puedes poner un barco de 4 Casillas");
                        }
                        break;
                    case 5:
                        if(!Portamosquitos){
                            
                            Portamosquitos = true;
                            System.out.println("Has seleccionado el 5");
                            //FALTA COLOCAR EL BARCO PARA QUE FUNCIONE
                            barco1.colocarPortaAviones(sn, tablero);
                            tablero.mostrarTablero();
                        
                            System.out.print("\n" + "Tablero enemigo" + "\n");
                            barco1.colocarPortaAvionesEnemigo(rnd, tableroEnemigo);
                            tableroEnemigo.mostrarTableroEnemigo();
                            
                        }else{
                            System.out.println("Solo puedes poner un barco de 5 Casillas");
                        }
                        
                        break;
                    case 6:
                        jugador1.Disparar(opcion, opcion, tableroEnemigo);
                        jugadorEnemigo.DisparoEnemigo(opcion, opcion, tablero);
                        tablero.mostrarTablero();
                        System.out.println(" ");
                        tableroEnemigo.mostrarTableroEnemigo();
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
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


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirlaflota;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class Jugador {

    Scanner sc = new Scanner(System.in);
    Tablero tablero = new Tablero();
    
    int saludBarco3 = 3;
    int saludBarco4 = 4;
    int saludBarco5 = 5;
    
    public void Disparar(int x, int y, Tablero tablero) {
        boolean repeticion = false;

        while (!repeticion) {
            System.out.println("¿Donde quieres disparar?");
            System.out.print("Dame la coordenada X: ");
            x = sc.nextInt();

            System.out.print("Dame la coordenada y: ");
            y = sc.nextInt();

            //for (int i = 1; i < tablero.tablero.length;) {
            if (tablero.tablero[y][x] == "~") {
                    System.out.println("Agua!");
                    tablero.tablero[y][x] = "A";
                    repeticion = true;
            } else {
                if (tablero.tablero[y][x] != "~") {
                    
                    System.out.println("Coordenadas repetidas"); 
                }

            }
            if (tablero.tablero[y][x] == "1") {
                System.out.println("Hundido");
                tablero.tablero[y][x] = "X";
                //System.out.print(tablero.tablero[y][x] = "X");

            } else if (tablero.tablero[y][x] == "3" || tablero.tablero[y][x] == "4" || tablero.tablero[y][x] == "5") {
                System.out.println("Tocado!");
                tablero.tablero[y][x] = "*";
                //System.out.println(tablero.tablero[y][x] = "*");

            }
        }

    }

    public void DisparoEnemigo(int x, int y, Tablero tablero) {
        System.out.println("¿Donde quieres disparar?");
        Random rnd = new Random();
        boolean repeticion1 = false;

        System.out.print("Dame la coordenada X: ");
        x = rnd.nextInt(9) + 1;

        System.out.print("Dame la coordenada y: ");
        y = rnd.nextInt(9) + 1;

        //for (int i = 1; i < tablero.tablero.length;) {
        if (tablero.tablero[y][x] != "~") {
            repeticion1 = true;
            System.out.println("Coordenadas repetidas");
        } else {
            System.out.println("Agua!");
            tablero.tablero[y][x] = "A";
        }

        //System.out.print(tablero.tablero[y][x]);
        if (tablero.tablero[y][x] == "1") {
            System.out.println("Hundido");
            tablero.tablero[y][x] = "X";
            //System.out.print(tablero.tablero[y][x] = "X");

        } else if (tablero.tablero[y][x] == "3" || tablero.tablero[y][x] == "4" || tablero.tablero[y][x] == "5") {
            System.out.println("Tocado!");
            tablero.tablero[y][x] = "*";
            //System.out.println(tablero.tablero[y][x] = "*");

        }

    }

    //}
}

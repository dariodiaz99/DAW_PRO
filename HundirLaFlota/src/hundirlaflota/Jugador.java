/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirlaflota;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class Jugador {
    
    Tablero jugador;
    Tablero enemigo;
    
    public Jugador(){
        jugador = new Tablero();
        enemigo = new Tablero();
    }
    
    public void barco1() {
        Barco barco1 = new Barco();
        Scanner cin = new Scanner(System.in);
        Barco.colocarBarco1(Tablero.);
    }
}

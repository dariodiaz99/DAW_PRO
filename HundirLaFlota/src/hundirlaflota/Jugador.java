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
    
    Tablero tablero = new Tablero();
    private int barco;
    
    public Jugador(){
        this.barco = 6;

    }
    
    public int getBarco(){
        return barco;
    }
    
    public void mostrarTablero() {
        tablero.crearTablero();
    }
    
    public void lancha() {
        Barco lancha = new Barco();
        Scanner sn = new Scanner(System.in);
        lancha.colocarLancha(sn, tablero.tablero);
    }
}

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
     Scanner sc = new Scanner(System.in);   


    public void Disparar(int x, int y, Tablero tablero){
        System.out.println("Donde quieres disparar?");
        System.out.print("Dame la coordenada X: ");
        x = sc.nextInt();
           
           
        System.out.print("Dame la coordenada y: ");
        y = sc.nextInt();
        for (int i = 0; i < tablero.tablero.length; i++) {
             if(tablero.tablero[y][x] == "~"){
            System.out.println("~");
        }else if(tablero.tablero[y][x] == "1" || tablero.tablero[y][x]==("/")){
            System.out.println("X");
        }else if(tablero.tablero[y][x]==("3") || tablero.tablero[y][x]==("4") || tablero.tablero[y][x]==("5") ){
            System.out.println("/");
        }  
            
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hundirlaflota;





/**
 *
 * @author Oscar
 */

public class Tablero {
    int tablero[][];
    
        public Tablero() {
        tablero = new int[11][11];
    }

    public void crearTablero() {
        int i = '~';
        // mostra la primera fila de numeros del 1 al 10
        System.out.print( "  | " );
        for (int x = 1; x < tablero.length; x++) {
            System.out.print( x + " " + " ");
        }
        //
        
        // divisor de numeros horizontales con el mapa
        System.out.print("| \n");
        for (int x = 1; x < tablero.length + 4; x++) {
            System.out.print("--");
        }
        //
        
        System.out.println("");
        for (int x = 1; x < 11; x++) {
            int[] is = tablero[x];
            System.out.print( x + " |" + " ");
            for (int y = 1; y < 11; y++) {
                switch (tablero[x][y]) {
                    default:
                        System.out.print("~" + " " + " ");
                        break;
                }
            }
            System.out.print("| \n");
            System.out.println(" ");
        }
        

        // divisor final del mapa
        
        for (int x = 1; x < tablero.length + 4; x++) {
            System.out.print("--");
        }
        System.out.println("");
    }
       //
}


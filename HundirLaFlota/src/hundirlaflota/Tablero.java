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
        int i = 0;
        // mostra la primera fila de numeros del 1 al 10
        System.out.print( "  | " );
        for (int x = 1; x < tablero.length; x++) {
            System.out.print( x + " " + " ");
        }
        //
        
        // divisor de numeros horizontales con el mapa
        System.out.print("| \n");
        for (int x = 0; x < tablero.length + 4; x++) {
            System.out.print("--");
        }
        //
        
        System.out.println("");
        for (int x = 1; x < 11; x++) {
            int[] is = tablero[x];
            System.out.print( x + " |" + " ");
            for (int y = 1; y < 11; y++) {
                switch (tablero[x][y]) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.print(tablero[x][y] + " ");
                        break;
                    case 8:
                        System.out.print(tablero[x][y] + " ");
                        break;
                    default:
                        System.out.print(tablero[x][y] + " " + " ");
                        break;
                }
            }
            System.out.print("| \n");
            System.out.println(" ");
        }
        

        // divisor final del mapa
        
        for (int x = 0; x < tablero.length + 4; x++) {
            System.out.print("--");
        }
        System.out.println("");
    }
       //
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hundirlaflota;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */

public class Tablero {
    
    public Tablero(){
        
    }
    
    public Tablero(int size, int y, int x) {
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    int size;
    int x;
    int y;
    
    private char colocarBarco(){
        Scanner sc = new Scanner(System.in);
        char Posicion = 0;
        
        char barco[][] = new char[x][y];
        System.out.println("Dame las coordenada x");
        x = sc.next().charAt(x);
        
        System.out.println("Dame la coordenada y");
        y = sc.next().charAt(y);
        
        System.out.println("coordenadas = " + x + y);
        
        return Posicion;
    }
    
    public static void GenerarTablero(){
    char tablero[][] = new char[11][12];
    
    tablero[1][1] = '~';
    tablero[1][2] = '~';
   
    //tablero[1][3] = '~';
    
    tablero[2][1] = '~';
    tablero[2][2] = '~';
    int num = 0;
    char let= '@';
        for (char[] tablero1 : tablero) {
            System.out.print("| "+num);
            num++;
            for (int y = 0; y < tablero1.length; y++) {
                System.out.print(tablero1[y]);
                if (y != tablero1.length - 1) {
                    System.out.print("\t"+"| ");
                    if ( let < 74 && let > 63 ) {
                        let++; 
                        System.out.print(let);
                    }
                }
            }
            System.out.println("");
        }
    }

    public int getSize() {
        return size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public static void main(String[] args) {
        GenerarTablero();
    }
    
}

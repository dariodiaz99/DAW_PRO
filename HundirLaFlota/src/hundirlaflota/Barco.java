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
public class Barco {
   public void colocarBarco1(int tablero[][]){
       Scanner sc = new Scanner(System.in);
       boolean barco1 = false;
       
       while (!barco1) {
           System.out.print("Dame la coordenada X: ");
           int x = sc.nextInt();
           
           System.out.println("Dame la coordenada Y: ");
           int y = sc.nextInt();
           
           if ( 0 <= x && y <= 10){
               barco1 = true;
               tablero[y][x] = 1;
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               barco1 = false;
           }
           
       }
   }
}
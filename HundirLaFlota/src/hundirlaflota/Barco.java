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
   public void colocarLancha(Scanner sn, int tablero[][]){
       
       boolean lancha = false;
       
       while (!lancha) {
           System.out.print("Dame la coordenada X: ");
           int x = sn.nextInt();
           System.out.print("Dame la coordenada y: ");
           int y = sn.nextInt();
           
           if ( x < 10 && y < 10 && x >= 0 && y >= 0){
               lancha = true;
               tablero[y][x] = 1;
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               lancha = false;
           }
           
       }
   }

}
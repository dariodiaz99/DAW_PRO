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
 * @author Oscar
 */
public class Barco {
    
    // 5 casillas portaaviones
    // 4 casillas buque
    // 3 casillas submarino
    // 1 casilla lancha
    
    
   public void colocarLancha(Scanner sn, Tablero tablero){
       
       boolean lancha = false;
       
       while (!lancha) {
           
           System.out.print("Dame la coordenada X: ");
           int x = sn.nextInt();
           
           
           System.out.print("Dame la coordenada y: ");
           int y = sn.nextInt();
           
           if (tablero.tablero[y][x] != "~") {
               System.out.println("Dario hijoputa");
               lancha = true;
           }else{
           if ( x < 10 && y < 10 && x >= 0 && y >= 0 ){
               lancha = true;
               System.out.println(x);
               System.out.println(y);
               tablero.tablero[y][x] = "1";
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               lancha = false;
           }   
        }
        }
   }
   
   public void colocarSubmarino(Scanner sn, Tablero tablero){
       boolean lancha = false;
       
       while (!lancha) {
           System.out.print("Dame la coordenada X: ");
           int x = sn.nextInt();
           
           
           System.out.print("Dame la coordenada y: ");
           int y = sn.nextInt();
           
           if (tablero.tablero[y][x] != "~") {
               System.out.println("COORDENADAS REPETIDAS POR EL BARCO: " + tablero.tablero[y][x]);
               
           }else{
           if ( x < 10 && y < 10 && x >= 0 && y >= 0){
               lancha = true;
               System.out.println("Dame la direccion la cual quieres colocarlo H=Horizontal / V=Vertical");
               //System.out.println(x);
               //System.out.println(y);
               //tablero.tablero[y][x] = "3";
               char direccion = sn.next().charAt(0);
               switch(direccion){
                   case 'H':
                       if (y - 1 > 0 && x+2 <= 10) {
                          
                                tablero.tablero[y][x] = "3";
                                tablero.tablero[y][x+1] = "3";
                                tablero.tablero[y][x+2] = "3";
                                lancha = true;
                            
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
                   case 'V':
                     
                       if (y - 1 > 0 && y+3 <= 10) {
                                tablero.tablero[y][x] = "3";
                                tablero.tablero[y+1][x] = "3";
                                tablero.tablero[y+2][x] = "3";
                                tablero.tablero[y+3][x] = "3";
                                lancha = true;
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
               }
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               lancha = false;
           }
           }
       } 
   }

   public void colocarBuque(Scanner sn, Tablero tablero){
       boolean lancha = false;
       
       while (!lancha) {
           System.out.print("Dame la coordenada X: ");
           int x = sn.nextInt();
           
           
           System.out.print("Dame la coordenada y: ");
           int y = sn.nextInt();
           
           
           if ( x < 10 && y < 10 && x >= 0 && y >= 0){
               lancha = true;
               System.out.println("Dame la direccion la cual quieres colocarlo H=Horizontal / V=Vertical");
               //System.out.println(x);
               //System.out.println(y);
               //tablero.tablero[y][x] = "3";
               char direccion = sn.next().charAt(0);
               switch(direccion){
                   case 'H':
                       if (y - 1 > 0 && x+3 <= 10) {
                          
                                tablero.tablero[y][x] = "4";
                                tablero.tablero[y][x+1] = "4";
                                tablero.tablero[y][x+2] = "4";
                                tablero.tablero[y][x+3] = "4";
                                lancha = true;
                            
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
                   case 'V':
                       
                       if (y - 1 > 0 && y+3 <= 10) {
                                tablero.tablero[y][x] = "4";
                                tablero.tablero[y+1][x] = "4";
                                tablero.tablero[y+2][x] = "4";
                                tablero.tablero[y+3][x] = "4";
                                lancha = true;
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
               }
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               lancha = false;
           }   
       } 
   }
   
      public void colocarPortaAviones(Scanner sn, Tablero tablero){
       boolean lancha = false;
       
       while (!lancha) {
           System.out.print("Dame la coordenada X: ");
           int x = sn.nextInt();
           
           
           System.out.print("Dame la coordenada y: ");
           int y = sn.nextInt();
           
           
           if ( x < 10 && y < 10 && x >= 0 && y >= 0){
               lancha = true;
               System.out.println("Dame la direccion la cual quieres colocarlo H=Horizontal / V=Vertical");
               //System.out.println(x);
               //System.out.println(y);
               //tablero.tablero[y][x] = "3";
               char direccion = sn.next().charAt(0);
               switch(direccion){
                   case 'H':
                       if (y - 1 > 0 && x+4 <= 10) {
                          
                                tablero.tablero[y][x] = "5";
                                tablero.tablero[y][x+1] = "5";
                                tablero.tablero[y][x+2] = "5";
                                tablero.tablero[y][x+3] = "5";
                                tablero.tablero[y][x+4] = "5";
                                lancha = true;
                            
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
                   case 'V':
                       
                       if (y - 1 > 0 && y+4 <= 10) {
                                tablero.tablero[y][x] = "5";
                                tablero.tablero[y+1][x] = "5";
                                tablero.tablero[y+2][x] = "5";
                                tablero.tablero[y+3][x] = "5";
                                tablero.tablero[y+4][x] = "5";
                                lancha = true;
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
               }
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               lancha = false;
           }   
       } 
   }
      
      ////////////////////////////////////////////////////////////////////////ENEMIGO/////////////////////////////////////////////////////////
      
      public void colocarLanchaEnemigo(Random rnd, Tablero tablero){
       
       boolean lancha = false;
       
       
       while (!lancha) {
           System.out.println("Dame la coordenada X: ");
           int x = rnd.nextInt(9)+1;
           
           
           System.out.println("Dame la coordenada y: ");
           int y = rnd.nextInt(9)+1;
           
           
           if ( x < 10 && y < 10 && x >= 0 && y >= 0 ){
               lancha = true;
               System.out.println(x);
               System.out.println(y);
               tablero.tablero[y][x] = "1";
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               lancha = false;
           }   
       }   
   }
   
      
      public void colocarSubmarinoEnemigo(Random rnd, Tablero tablero){
       boolean lancha = false;
       
       while (!lancha) {
           System.out.print("Dame la coordenada X: ");
           int x = rnd.nextInt(9)+1;
           
           
           System.out.print("Dame la coordenada y: ");
           int y = rnd.nextInt(9)+1;
           
           
           if ( x < 10 && y < 10 && x >= 0 && y >= 0){
               lancha = true;
               System.out.println("Dame la direccion la cual quieres colocarlo H=Horizontal / V=Vertical");
               
               //System.out.println(x);
               //System.out.println(y);
               //tablero.tablero[y][x] = "3";
               //String sc = new String();
               String direccion1 = "HV"; 
               char direccion = direccion1.charAt(rnd.nextInt(direccion1.length()));
               switch(direccion){
                   
                   case 'H':
                       if (y - 1 > 0 && x+2 <= 10) {
                          
                                tablero.tablero[y][x] = "3";
                                tablero.tablero[y][x+1] = "3";
                                tablero.tablero[y][x+2] = "3";
                                lancha = true;
                            
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
                   case 'V':
                       
                       if (y - 1 > 0 && y+2 <= 10) {
                                tablero.tablero[y][x] = "3";
                                tablero.tablero[y+1][x] = "3";
                                tablero.tablero[y+2][x] = "3";
                                lancha = true;
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
               }
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               lancha = false;
           }   
       } 
   }
   
   public void colocarBuqueEnemigo(Random rnd, Tablero tablero){
       boolean lancha = false;
       
       while (!lancha) {
           System.out.print("Dame la coordenada X: ");
           int x = rnd.nextInt(9)+1;
           
           
           System.out.print("Dame la coordenada y: ");
           int y = rnd.nextInt(9)+1;
           
           
           if ( x < 10 && y < 10 && x >= 0 && y >= 0){
               lancha = true;
               System.out.println("Dame la direccion la cual quieres colocarlo H=Horizontal / V=Vertical");
               
               //System.out.println(x);
               //System.out.println(y);
               //tablero.tablero[y][x] = "3";
               //String sc = new String();
               String direccion1 = "HV"; 
               char direccion = direccion1.charAt(rnd.nextInt(direccion1.length()));
               switch(direccion){
                   
                   case 'H':
                       if (y - 1 > 0 && x+3 <= 10) {
                          
                                tablero.tablero[y][x] = "4";
                                tablero.tablero[y][x+1] = "4";
                                tablero.tablero[y][x+2] = "4";
                                tablero.tablero[y][x+3] = "4";
                                lancha = true;
                            
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
                   case 'V':
                       
                       if (y - 1 > 0 && y+3 <= 10) {
                                tablero.tablero[y][x] = "4";
                                tablero.tablero[y+1][x] = "4";
                                tablero.tablero[y+2][x] = "4";
                                tablero.tablero[y+3][x] = "4";
                                lancha = true;
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
               }
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               lancha = false;
           }   
       } 
   }
   
   public void colocarPortaAvionesEnemigo(Random rnd, Tablero tablero){
       boolean lancha = false;
       
       while (!lancha) {
           System.out.print("Dame la coordenada X: ");
           int x = rnd.nextInt(9)+1;
           
           
           System.out.print("Dame la coordenada y: ");
           int y = rnd.nextInt(9)+1;
           
           
           if ( x < 10 && y < 10 && x >= 0 && y >= 0){
               lancha = true;
               System.out.println("Dame la direccion la cual quieres colocarlo H=Horizontal / V=Vertical");
               
               //System.out.println(x);
               //System.out.println(y);
               //tablero.tablero[y][x] = "3";
               //String sc = new String();
               String direccion1 = "HV"; 
               char direccion = direccion1.charAt(rnd.nextInt(direccion1.length()));
               switch(direccion){
                   
                   case 'H':
                       if (y - 1 > 0 && x+4 <= 10) {
                          
                                tablero.tablero[y][x] = "5";
                                tablero.tablero[y][x+1] = "5";
                                tablero.tablero[y][x+2] = "5";
                                tablero.tablero[y][x+3] = "5";
                                tablero.tablero[y][x+4] = "5";
                                lancha = true;
                            
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
                   case 'V':
                       
                       if (y - 1 > 0 && y+4 <= 10) {
                                tablero.tablero[y][x] = "5";
                                tablero.tablero[y+1][x] = "5";
                                tablero.tablero[y+2][x] = "5";
                                tablero.tablero[y+3][x] = "5";
                                tablero.tablero[y+4][x] = "5";
                                lancha = true;
                            } else {
                                lancha = false;
                                System.out.println("Introduce otra direccion debido a que excede el limite del tablero ó hay un barco en esa posicion");
                            }
                            break;
               }
           }else{
               System.out.println("Vuelve a introducir otras coordenadas diferentes a las anteriores");
               lancha = false;
           }   
       } 
   }
   
}
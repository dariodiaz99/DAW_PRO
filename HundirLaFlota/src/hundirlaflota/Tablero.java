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
    String tablero[][];
    //String tableroEnemigo[][];
    Barco barco = new Barco();

    
    
    
    public Tablero() {
        tablero = new String[11][11];
        
        //tableroEnemigo = new String[11][11];
//        for (int i = 0; i < tablero.length; i++) {
//            //String[] strings = tablero[i];
//            for (int j = 0; j < 10; j++) {
//               tablero[i][j] = "~"; 
//            }
//        }
    }

    public void crearTablero() {
        
        // mostra la primera fila de numeros del 1 al 10
        System.out.print( "  | " );
        for (int x = 1; x < tablero.length;x++) {
            if (x == 1) {
                System.out.print( x + " " + " " + " " ); 
            }else{
                System.out.print( x + " " + " " + " "); 
            }
            
        }
        //
        
        // divisor de numeros horizontales con el mapa
        System.out.print("| \n");
        for (int x = 0; x < tablero.length * 2; x++) {
            System.out.print("--");
        }
        System.out.println("");
        //
        //mostrar mapa
            for (int i = 1; i < tablero.length; i++) {
            //String[] strings = tablero[i];
                if (i < 10) {
                    System.out.print(i + " | ");
                }else{
                    System.out.print(i + "| ");
                }
                
            for (int j = 1; j < tablero.length; j++) {
               tablero[i][j] = "~";
                System.out.print(tablero[i][j] + "  " + " ");
            }
                System.out.println("");
        }

        // divisor final del mapa
        
        for (int x = 0; x < tablero.length * 2; x++) {
            System.out.print("--");
        }
        System.out.println("");
    }
    
    public void mostrarTablero(){
         System.out.print( "  | " );
        for (int x = 1; x < tablero.length;x++) {
            if (x == 1) {
                System.out.print( x + " " + " " + " " ); 
            }else{
                System.out.print( x + " " + " " + " "); 
            }
            
        }
        //
        
        // divisor de numeros horizontales con el mapa
        System.out.print("| \n");
        for (int x = 0; x < tablero.length * 2; x++) {
            System.out.print("--");
        }
        System.out.println("");
        //
        //mostrar mapa
            for (int i = 1; i < tablero.length; i++) {
            //String[] strings = tablero[i];
                if (i < 10) {
                    System.out.print(i + " | ");
                }else{
                    System.out.print(i + "| ");
                }
                
            for (int j = 1; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + "  " + " ");
            }
                System.out.println("");
        }
    }
    
      public void crearTableroEnemigo() {
        
        // mostra la primera fila de numeros del 1 al 10
        System.out.print( "  | " );
        for (int x = 1; x < tablero.length;x++) {
            if (x == 1) {
                System.out.print( x + " " + " " + " " ); 
            }else{
                System.out.print( x + " " + " " + " "); 
            }
            
        }
        //
        
        // divisor de numeros horizontales con el mapa
        System.out.print("| \n");
        for (int x = 0; x < tablero.length * 2; x++) {
            System.out.print("--");
        }
        System.out.println("");
        //
        //mostrar mapa
            for (int i = 1; i < tablero.length; i++) {
            //String[] strings = tablero[i];
                if (i < 10) {
                    System.out.print(i + " | ");
                }else{
                    System.out.print(i + "| ");
                }
                
            for (int j = 1; j < tablero.length; j++) {
               tablero[i][j] = "~";
                System.out.print(tablero[i][j] + "  " + " ");
            }
                System.out.println("");
        }

        // divisor final del mapa
        
        for (int x = 0; x < tablero.length * 2; x++) {
            System.out.print("--");
        }
        System.out.println("");
    }
    
     public void mostrarTableroEnemigo(){
         System.out.print( "  | " );
        for (int x = 1; x < tablero.length;x++) {
            if (x == 1) {
                System.out.print( x + " " + " " + " " ); 
            }else{
                System.out.print( x + " " + " " + " "); 
            }
            
        }
        //
        
        // divisor de numeros horizontales con el mapa
        System.out.print("| \n");
        for (int x = 0; x < tablero.length * 2; x++) {
            System.out.print("--");
        }
        System.out.println("");
        //
        //mostrar mapa
            for (int i = 1; i < tablero.length; i++) {
            //String[] strings = tablero[i];
                if (i < 10) {
                    System.out.print(i + " | ");
                }else{
                    System.out.print(i + "| ");
                }
                
            for (int j = 1; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + "  " + " ");
            }
                System.out.println("");
        }
    }  
      
//    public void mostrarTableroEnemigo(){
//                 System.out.print( "  | " );
//        for (int x = 1; x < tablero.length;x++) {
//            if (x == 1) {
//                System.out.print( x + " " + " " + " " ); 
//            }else{
//                System.out.print( x + " " + " " + " "); 
//            }
//            
//        }
//        //
//        
//        // divisor de numeros horizontales con el mapa
//        System.out.print("| \n");
//        for (int x = 0; x < tablero.length * 2; x++) {
//            System.out.print("--");
//        }
//        System.out.println("");
//        //
//        //mostrar mapa
//            for (int i = 1; i < tablero.length; i++) {
//            //String[] strings = tablero[i];
//                if (i < 10) {
//                    System.out.print(i + " | ");
//                }else{
//                    System.out.print(i + "| ");
//                }
//                
//            for (int j = 1; j < 10; j++) {
//                //if (tablero[i][j] != "~" && tablero[i][j] != "X") {
//                    //System.out.println(tablero[i][j]="~");
//                //}
//                System.out.print(tablero[i][j] + "  " + " ");
//            }
//                System.out.println("");
//        }
//    }
    
       //
}


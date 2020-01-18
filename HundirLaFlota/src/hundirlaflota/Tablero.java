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

    public Tablero(int size, int x, int y) {
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    int size;
    int x;
    int y;
    public static void GenerarTablero(){
    char tablero[][] = new char[12][12];
    
    tablero[1][1] = '~';
    tablero[1][2] = '~';
  
    tablero[2][1] = '~';
    tablero[2][2] = '~';
    int num = 0;
    char let= '@';
        for (int x=0; x < tablero.length; x++) {
            System.out.print("|"+num);
            num++;
            for (int y=0; y < tablero[x].length; y++) {
                System.out.print (tablero[x][y]);
                  
           
                if (y!=tablero[x].length-1){
                    System.out.print("\t");
                    if ( let < 74 && let > 63 ) {
                        let++; 
                        System.out.print(let);
                         
                   
                    
                    }
                   
                }
            }
            System.out.println("|");
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

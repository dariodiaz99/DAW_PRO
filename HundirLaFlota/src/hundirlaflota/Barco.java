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
public class Barco {
   int tamanio;
   boolean salud;
   
   public Barco(int tamanio){
       this.tamanio = tamanio;
       this.salud = true;
   }
   
   public static void colocarBarco(int medida) {


       int yIni = (int) (Math.random() * Tablero.yMax); //xIni e yIni es desde donde parte el barco.
        int xIni = (int) (Math.random() * Tablero.xMax);

        for (int k = 0; k < medida; k++) {
            if (!Tablero.tabla[yIni][xIni].contenido) {
                Tablero.tabla[yIni][xIni].forma = '*';
                Tablero.tabla[yIni][xIni].contenido = true;
                //posicionesOcupadas = new int[yIni][xIni];
            } else {
                k--;
            }
        }
    }
   
   private int medida;

    enum barcos {
        portaaviones, buque, lancha
    };
    private boolean hundido = false;
    private int[][] posicionesOcupadas;
    private boolean[][] posicionesHeridas;
    private int direccion;


 
    public Barco(barcos tipo) {
        switch (tipo) {
            case portaaviones:
                medida = 5;
                posicionesOcupadas = new int[medida][2];
                break;
            case buque:
                medida = 3;
                posicionesOcupadas = new int[medida][2];
            case lancha:
                medida = 1;
                posicionesOcupadas = new int[medida][2];
        }
    }
}
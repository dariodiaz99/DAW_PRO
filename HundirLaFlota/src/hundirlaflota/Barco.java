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
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }
    int tamaño;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Barco(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public static void Atacar(int tamaño, String Barco){
        Scanner sc = new Scanner(System.in);
        /*Barco.Atacar(2);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
               
            }
            System.out.println();
        }*/
        
        System.out.println("Introduzca las coordenadas del disparo");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
    }
}

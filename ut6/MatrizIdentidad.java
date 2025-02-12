/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6;

/**
 *
 * @author Alumno
 */
public class MatrizIdentidad {
    private int n;
    public MatrizIdentidad(int n){
        this.n = n;
    }
    
    public void generarMatriz(){
        int valor = 1, fila = 0, fin = n-1;
        int[][] matriz = new int [n][n];
        
        for (int i = fila; i < fin; i++) {
            matriz[fila][i] = valor++;
        }
    }
    
    public static void main(String[] args){
        MatrizIdentidad matriz = new MatrizIdentidad(6);
        matriz.generarMatriz();
    }
}

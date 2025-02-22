/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 23-Feb-2025
 */
public class SumMatrix {

    public void sum(String[] args) {
        double[][] matriz = {
            {1.5, 2.3, 3.7},
            {4.2, 5.8, 6.1},
            {7.9, 8.4, 9.6}
        };

        double sumTotal = 0;

        // recorrer la matriz y sumar todos los valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumTotal += matriz[i][j];
            }
        }

        System.out.printf("La suma total de la matriz es: %.2f%n", sumTotal);
    }
}

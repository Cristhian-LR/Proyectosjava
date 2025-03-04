/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @autor: Cristhian Loya
 * Matricula: 15186
 * Fecha: 06-Feb-2025
 */
public class Calificaciones {
    public static void Average(String[] args) {
        // arreglo de tipo double con 3 calificaciones
        double[] ratings = {85.5, 90.0, 78.5};

        double sum = 0.0;

        // ciclo for para recorrer el arregloy sumar todas las calificaciones
        for (int i = 0; i < ratings.length; i++) {
            System.out.println("calificacion " + (i + 1) + ": " + ratings[i]);
            sum += ratings[i];
        }

        // alcular el promedio
        double average = sum / ratings.length;

        // mprimir la suma total y el promedio final
        System.out.println("suma total: " + sum);
        System.out.println("promedio final: " + average);
    }
}
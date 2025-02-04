/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @author DELL
 */
public class Calificaciones {
    public static void main(String[] args) {
        int[] calificaciones = new int[3];
        calificaciones[0] = 9;
        calificaciones[1] = 9;
        calificaciones[2] = 8;

        System.out.println("Hello World!");

        int suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + calificaciones[i]);
            suma += calificaciones[i];
        }

        double promedio = (double) suma / calificaciones.length;
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}

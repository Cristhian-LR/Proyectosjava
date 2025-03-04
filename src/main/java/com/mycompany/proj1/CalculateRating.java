/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

import java.util.Scanner;
/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 23-Feb-2025
 */
public class CalculateRating {
    public void averageFinal(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // Pedir la calificación del examen parcial
        System.out.println("Ingrese la calificación del examen parcial: ");
        double exam = scanner.nextDouble();

        // Pedir la calificación de las tareas
        System.out.println("Ingrese la calificación promedio de las tareas: ");
        double task = scanner.nextDouble();

        // Calcular la calificación total
        double calificacionFinal = (exam * 0.70) + (task * 0.30);

        // Mostrar el resultado final
        System.out.printf("La calificación final es: %.2f%n", calificacionFinal);

        scanner.close();
    }
}
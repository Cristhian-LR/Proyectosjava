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
 * Fecha: 24-Feb-2025
 */
public class GradeCalculationPartial {
    public void averageStatusFinal(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // pedir la calificación del examen parcial
        System.out.println("Examen parcial: ");
        double exam = scanner.nextDouble();

        // pedir la calificación de las tareas
        System.out.println("Tareas: ");
        double task = scanner.nextDouble();

        // calcular la calificación total
        double calificacionFinal = (exam * 0.70) + (task * 0.30);

        // mostrar el resultado final
        System.out.printf("La calificación final es: %.2f%n", calificacionFinal);

        scanner.close();
    }
}
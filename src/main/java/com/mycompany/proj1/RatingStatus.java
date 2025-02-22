/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

import java.util.Random;

public class RatingStatus {
    public void PassOrFail(String[] args) {
        int numberStudents = 10;
        int[] ratings = new int[numberStudents];

        // genera numeros aleatorios
        Random random = new Random();

        // variables para contar aprobados y reprobados
        int pass = 0;
        int fails = 0;

        //calificaciones aleatorias y contar
        System.out.println("Calificaciones:");
        for (int i = 0; i < numberStudents; i++) {
            ratings[i] = random.nextInt(101); // numeros entre 0 y 100
            System.out.println("Alumno " + (i + 1) + ": " + ratings[i]);

            if (ratings[i] >= 70) {
                pass++;
            } else {
                fails++;
            }
        }

        System.out.println("Total de alumnos aprobados: " + pass);
        System.out.println("Total de alumnos reprobados: " + fails);
    }
}

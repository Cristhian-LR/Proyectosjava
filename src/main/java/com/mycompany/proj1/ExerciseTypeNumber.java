/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @autor: Cristhian Loya
 * Matricula: 15186
 * Fecha: 18-Feb-2025
 */
public class ExerciseTypeNumber {

    public void typeNumber(String[] args) {
        // arreglo de tipo double con 3 calificaciones
        int[] numeros = {
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26,
            29, 32, 35, 38, 41, 44, 47, 50, 53, 56,
            59, 62, 65, 68, 71, 74, 77, 80, 83, 86,
            89, 92, 95, 98, 0, 3, 6, 9, 12, 15,
            18, 21, 24, 27, 30, 33, 36, 39, 42, 45
        };

        int countPares = 0;
        int countNones = 0;
        int countCeros = 0;

        for (int number : numeros) {
            if (number == 0) {
                countCeros++;
            } else if (number % 2 == 0) {
                countPares++;
            } else {
                countNones++;
            }
        }
        System.out.println("Total de números pares:" + countPares);
        System.out.println("Total de números nones:" + countNones);
        System.out.println("Total de ceros:" + countCeros);
    }
}

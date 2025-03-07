/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1.SecondPartial;

/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 06-Marz-2025
 */
public class BubbleSortExample {

    public static int bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++; // Contar comparaciones
                if (arr[j] > arr[j + 1]) {
// Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return comparisons;
    }
}
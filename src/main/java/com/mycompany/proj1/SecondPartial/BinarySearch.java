/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1.SecondPartial;

/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 18-Marz-2025
 */
public class BinarySearch {
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int comparisons = 0;

        while (left <= right) {
            comparisons++; // Contador de comparaciones
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Comparaciones: " + comparisons);
                return mid; // Devuelve el índice si encuentra el número
            } else if (arr[mid] < target) {
                left = mid + 1; // Buscar en la mitad derecha
            } else {
                right = mid - 1; // Buscar en la mitad izquierda
            }
        }

        System.out.println("Comparaciones: " + comparisons);
        return -1; // Si el número no está en el arreglo
    }
}

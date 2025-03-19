/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1.SecondPartial;

/**
 *
 * @author DELL
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

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Debe estar ordenado
        
        System.out.println("Índice encontrado: " + bs.search(numbers, 7)); // Salida esperada: Índice 6 y comparaciones
        System.out.println("Índice encontrado: " + bs.search(numbers, 11)); // Salida esperada: -1 y comparaciones
    }
}

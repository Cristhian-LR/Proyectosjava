/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1.SecondPartial;

/**
 *
 * @author DELL
 */
public class SelectionSortExample {

    public static int selectionSort(int arr[]) {
        int n = arr.length;
        int operaciones = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                operaciones++; // Cuenta comparaciones
            }
            // Intercambio de elementos
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            operaciones += 3; // Cuenta las 3 asignaciones del intercambio

            // Imprimir el estado del arreglo en cada iteración
            System.out.print("Iteración " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return operaciones;
    }
}

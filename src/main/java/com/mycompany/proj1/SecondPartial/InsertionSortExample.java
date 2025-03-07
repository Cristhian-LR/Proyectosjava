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
public class InsertionSortExample {
    public static int insertionSort(int arr[]) {
        int n = arr.length;
        int operaciones = 0;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                operaciones++;
            }
            arr[j + 1] = key;
        }
        return operaciones;
    }
}

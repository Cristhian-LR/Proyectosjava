/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1.SecondPartial;

/**
 *
 * @author DELL
 */
import java.util.Arrays;

import java.util.Arrays;

public class QuickSort {

    static int comparaciones = 0;
    static int intercambios = 0;

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        intercambios++;
    }

    // Partición usando el esquema de partición de Lomuto
    public int partition(int[] a, int start, int end) {
        // Elija el elemento más a la derecha como un pivote de la array
        int pivot = a[end];

        // los elementos menores que el pivote serán empujados a la izquierda de pIndex
        // elementos más que el pivote serán empujados a la derecha de pIndex
        // elementos iguales pueden ir en cualquier dirección
        int pIndex = start;

        // cada vez que encontramos un elemento menor o igual que el pivote,
        // pIndex se incrementa, y ese elemento se colocaría
        // antes del pivote.
        for (int i = start; i < end; i++) {
            comparaciones++;
            if (a[i] <= pivot) {
                swap(a, i, pIndex);
                pIndex++;
            }
        }

        // intercambiar pIndex con pivote
        swap(a, end, pIndex);

        // devuelve pIndex (índice del elemento pivote)
        return pIndex;
    }

    // Rutina de clasificación rápida
    public void quicksortt(int[] a, int start, int end) {
        // condición base
        if (start >= end) {
            return;
        }

        // reorganizar los elementos a través del pivote
        int pivot = partition(a, start, end);

        // recurre en un subarray que contiene elementos menores que el pivote
        quicksortt(a, start, pivot - 1);

        // se repite en el subarray que contiene más elementos que el pivote
        quicksortt(a, pivot + 1, end);
    }

    // Implementación en Java del algoritmo Quicksort
    public void output(String[] args) {
        int[] a = {9, -3, 5, 2, 6, 8, -6, 1, 3};

        quicksortt(a, 0, a.length - 1);

        System.out.println("Arreglo ordenado: " + Arrays.toString(a));
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
    }
}

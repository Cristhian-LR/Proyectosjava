/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1.SecondPartial;

/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 24-Marz-2025
 */
public class SecondPartialMain {

    public static void main(String[] args) {
        
        /*int peorCaso[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        
        System.out.println("Peor Caso:");
        int operacionesPeor = BubbleSortExample.bubbleSort(peorCaso);
        for (int num : peorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nNumero total de operaciones: " + operacionesPeor); 
        
        int peorCaso[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int mejorCaso[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Peor Caso:");
        int operacionesPeor = SelectionSortExample.selectionSort(peorCaso);
        for (int num : peorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesPeor);
        
        System.out.println("\nMejor Caso:");
        int operacionesMejor = SelectionSortExample.selectionSort(mejorCaso);
        for (int num : mejorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesMejor);*/
        
        /*int peorCaso[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int mejorCaso[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Peor Caso:");
        int operacionesPeor = InsertionSortExample.insertionSort(peorCaso);
        for (int num : peorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesPeor);
        
        System.out.println("\nMejor Caso:");
        int operacionesMejor = InsertionSortExample.insertionSort(mejorCaso);
        for (int num : mejorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesMejor);
        
        LinealSort objLinealSort = new LinealSort();
        System.out.println(objLinealSort.find(5));
        
        HashMapp objHashMapp = new HashMapp();
        objHashMapp.printCapitalCities(args);
        
        IndexedSearch objIndexedSearch = new IndexedSearch();
        objIndexedSearch.search(args);
        
        QuickSort objQuickSort = new QuickSort();
        objQuickSort.output(args);
        
        
        int[] datos = {10, 20, 30, 40, 50};
        SearchSecuencial objSearchSecuencial =  new SearchSecuencial();
        int resultado = objSearchSecuencial.search(datos, 30);

        System.out.println("El número 30 está en la posición: " + resultado);*/
        
        BinarySearch objBinarySearch = new BinarySearch();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Debe estar ordenado
        
        System.out.println("Índice encontrado: " + objBinarySearch.search(numbers, 7)); // Salida esperada: Índice 6 y comparaciones
        System.out.println("Índice encontrado: " + objBinarySearch.search(numbers, 11)); // Salida esperada: -1 y comparaciones
        
    }
}
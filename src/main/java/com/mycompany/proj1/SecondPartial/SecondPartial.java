/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1.SecondPartial;


/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 23-Feb-2025
 */
public class SecondPartial {

    public static void main(String[] args) {
        
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
        System.out.println("\nOperaciones realizadas: " + operacionesMejor);
        
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
        System.out.println("\nOperaciones realizadas: " + operacionesMejor);*/
    }
}
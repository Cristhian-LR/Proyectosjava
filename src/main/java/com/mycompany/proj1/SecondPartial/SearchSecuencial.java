/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1.SecondPartial;

/**
 *
 * @author DELL
 */
public class SearchSecuencial {
    public int search(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i; // Retorna la posición del elemento encontrado
            }
        }
        return -1; // Retorna -1 si el elemento no está en el arreglo
    }
}
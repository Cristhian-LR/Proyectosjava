/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @author DELL
 */
public class ArrayMemory {
    public void printunidimensionalArray(String[] args) {
        int[] array = {10, 20, 30, 40};
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + " - Valor: " + array[i]);
        }
    }
}
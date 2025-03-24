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
public class LinealSort {
    public int find(int number){
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i  =0; i < numbers.length; i++){
            if (numbers[i]== number){
                return i;
            }
        
        }
        return -1;
    }
}
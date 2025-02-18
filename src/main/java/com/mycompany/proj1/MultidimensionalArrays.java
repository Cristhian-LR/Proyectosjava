/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @author DELL
 */
public class MultidimensionalArrays {

    public void printbidimensionalArray() {
        int[][] matrix = {
            {1, 2}, //[0][0] = 1 [0][1] = 2
            {3, 4}  //[1][0] = 3 [1][1] = 4
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("longitud de la fila" + matrix[i].length);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

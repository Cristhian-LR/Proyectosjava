/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 23-Feb-2025
 */
public class SalesCalculation {
    public void salesCalculationIVA(String[] args) {
        double[] sales = {100.0, 250.5, 80.0, 300.75, 150.0};

        // variable para almacenar la suma total con IVA
        double totalIVA = 0;

        // calcular la sumatoria con IVA multiplicando por 1.16
        for (double sale : sales) {
            totalIVA += sale * 1.16;
        }

        // mostrar el resultado
        System.out.printf("Total de ventas con IVA: $%.2f%n", totalIVA);
    }
}

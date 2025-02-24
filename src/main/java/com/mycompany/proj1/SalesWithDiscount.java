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
public class SalesWithDiscount {
    public void totalWithDiscount(String[] args) {
        double[] sales = {100.0, 200.0, 150.0};
        
        double totalDescuento = 0;
        double total = 0;

        for (double sale : sales) {
            totalDescuento = (sale - (sale*.9));
            System.out.println(""+totalDescuento);
            total += sale;
            System.out.println(""+total);
        }

        // mostrar el resultado
        System.out.printf("Total de ventas: $%.2f%n", total - totalDescuento);
    }
}

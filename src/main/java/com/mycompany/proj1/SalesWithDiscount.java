/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 24-Feb-2025
 */
public class SalesWithDiscount {
    public double totalWithDiscount() {
        double[] sales = {100.0, 200.0, 150.0};
        
        double total = 0;

        for (double sale : sales) {
            double discountPrice = sale * 0.9; // Aplica el 10% de descuento
            total += discountPrice;
        }

        return total;
    }
}


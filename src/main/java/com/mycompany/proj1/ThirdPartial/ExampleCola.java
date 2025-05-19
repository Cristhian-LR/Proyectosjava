/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1.ThirdPartial;

/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 18-Mayo-2025
 */


import java.util.LinkedList;
import java.util.Queue;

public class ExampleCola {
    private Queue<String> cola;

    public ExampleCola() {
        cola = new LinkedList<>();
    }

    public void addCustomer(String cliente) {
        cola.add(cliente);
        System.out.println("Agregado: " + cliente);
    }

    public void serveCustomer() {
        String cliente = cola.poll();
        if (cliente != null) {
            System.out.println("Atendiendo a: " + cliente);
        } else {
            System.out.println("No hay clientes para atender.");
        }
    }

    public void showCustomer() {
        String cliente = cola.peek();
        if (cliente != null) {
            System.out.println("Cliente al frente: " + cliente);
        } else {
            System.out.println("La cola está vacía.");
        }
    }
}

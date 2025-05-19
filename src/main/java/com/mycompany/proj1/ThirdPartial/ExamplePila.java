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
import java.util.Stack;

import java.util.Stack;

public class ExamplePila {
    Stack<String> pila;

    public ExamplePila() {
        pila = new Stack<>();
    }

    public void addElements(String element) {
        pila.push(element);
        System.out.println("Agregado: " + element);
    }

    public void showElementTop() {
        if (!pila.isEmpty()) {
            System.out.println("Elemento en la cima: " + pila.peek());
        } else {
            System.out.println("La pila está vacía.");
        }
    }
}

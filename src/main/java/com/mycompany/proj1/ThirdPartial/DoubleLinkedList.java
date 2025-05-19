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
public class DoubleLinkedList {

    // Clase interna para evitar conflictos
    private static class Nodo {
        int data;
        Nodo prev;
        Nodo next;

        Nodo(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Nodo head;
    private Nodo tail;

    // Constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Agregar al final
    public void agregarAlFinal(int data) {
        Nodo nuevoNodo = new Nodo(data);
        if (head == null) {
            head = tail = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            nuevoNodo.prev = tail;
            tail = nuevoNodo;
        }
    }

    // Agregar al inicio
    public void agregarAlInicio(int data) {
        Nodo nuevoNodo = new Nodo(data);
        if (head == null) {
            head = tail = nuevoNodo;
        } else {
            nuevoNodo.next = head;
            head.prev = nuevoNodo;
            head = nuevoNodo;
        }
    }

    // Eliminar un nodo por valor
    public void eliminar(int data) {
        Nodo actual = head;

        while (actual != null) {
            if (actual.data == data) {
                if (actual.prev != null) {
                    actual.prev.next = actual.next;
                } else {
                    head = actual.next;
                }

                if (actual.next != null) {
                    actual.next.prev = actual.prev;
                } else {
                    tail = actual.prev;
                }

                System.out.println("Nodo con valor " + data + " eliminado.");
                return;
            }
            actual = actual.next;
        }
        System.out.println("Nodo con valor " + data + " no encontrado.");
    }

    // Mostrar de inicio a fin
    public void mostrarAdelante() {
        System.out.print("Lista (inicio → fin): ");
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.data + " ");
            actual = actual.next;
        }
        System.out.println();
    }

    // Mostrar de fin a inicio
    public void mostrarAtras() {
        System.out.print("Lista (fin → inicio): ");
        Nodo actual = tail;
        while (actual != null) {
            System.out.print(actual.data + " ");
            actual = actual.prev;
        }
        System.out.println();
    }

    // Método main para probar la lista
    public static void main(String[] args) {
        DoubleLinkedList lista = new DoubleLinkedList();

        lista.agregarAlInicio(5);
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);

        lista.mostrarAdelante();   // Salida esperada: 5 10 20 30
        lista.mostrarAtras();      // Salida esperada: 30 20 10 5

        lista.eliminar(20);        // Elimina 20
        lista.mostrarAdelante();   // Salida esperada: 5 10 30
    }
}
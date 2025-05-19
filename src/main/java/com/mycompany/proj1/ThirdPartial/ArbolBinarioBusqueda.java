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
public class ArbolBinarioBusqueda {
    static class Nodo {
        int valor;
        Nodo izquierda, derecha;

        Nodo(int valor) {
            this.valor = valor;
        }
    }

    Nodo raiz;

    void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    Nodo insertarRec(Nodo nodo, int valor) {
        if (nodo == null) return new Nodo(valor);
        if (valor < nodo.valor)
            nodo.izquierda = insertarRec(nodo.izquierda, valor);
        else if (valor > nodo.valor)
            nodo.derecha = insertarRec(nodo.derecha, valor);
        return nodo;
    }

    void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecha);
        }
    }
}

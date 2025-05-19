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
import java.util.*;

public class GrafoListaAdyacencia {
    static class Grafo {
        private Map<Integer, List<Integer>> adyacencia = new HashMap<>();

        void agregarVertice(int v) {
            adyacencia.putIfAbsent(v, new ArrayList<>());
        }

        void agregarArista(int origen, int destino) {
            adyacencia.get(origen).add(destino);
            adyacencia.get(destino).add(origen); // No dirigido
        }

        void mostrar() {
            for (int v : adyacencia.keySet()) {
                System.out.println("Vertice " + v + " -> " + adyacencia.get(v));
            }
        }
    }
}

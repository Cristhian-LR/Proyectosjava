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
public class ThirdPartialMain {

    public static void main(String[] args) {
        
        
        GrafoListaAdyacencia.Grafo grafo = new GrafoListaAdyacencia.Grafo();
        // Agregar vértices
        for (int i = 1; i <= 5; i++) {
            grafo.agregarVertice(i);
        }

        // Agregar aristas
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(3, 5);

        System.out.println("Representación del grafo:");
        grafo.mostrar();
        
        /*
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("Recorrido in-orden del árbol:");
        arbol.inOrden(arbol.raiz);*/

        /*
        ExamplePila ejemplo = new ExamplePila();

        // Agregar elementos
        ejemplo.addElements("Plato 1");
        ejemplo.addElements("Plato 2");
        ejemplo.addElements("Plato 3");

        // Mostrar elemento en la cima
        ejemplo.showElementTop();

        // Eliminar elementos manualmente (simulación)
        System.out.println("Elemento removido: " + ejemplo.pila.pop());
        System.out.println("Elemento removido: " + ejemplo.pila.pop());

        // Mostrar elemento en la cima después del pop
        ejemplo.showElementTop();*/
        
        /*
        ExampleCola objExampleCola = new ExampleCola();

        objExampleCola.addCustomer("Cliente 1");
        objExampleCola.addCustomer("Cliente 2");
        objExampleCola.showCustomer();
        objExampleCola.serveCustomer();
        objExampleCola.showCustomer();  */
                /*
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("List:");
        list.display();

        System.out.println("Is 20 in the list? " + list.search(20));

        list.delete(20);
        list.delete(30);
        list.insert(40);


        System.out.println("After deleting 20:");
        list.display();*/
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @autor: Cristhian Loya
 * Matricula: 15186
 * Fecha: 06-Feb-2025
 */

import java.util.Random;

public class JuegoPiedraPaepelTijeras {
 //metodo para jugar pierdra papel o tijera
    public static void PlayGame(String[] args) {
        System.out.println("Vamos a jugar Piedra, Papel o Tijera");
        // creación de un objeto Random
        Random random = new Random();
        int opcion = random.nextInt(3);
        //elecccion basada en un numero aleatorio
        String resultado;
        switch (opcion) {
            case 0:
                resultado = "Piedra";
                break;
            case 1:
                resultado = "Papel";
                break;
            case 2:
                resultado = "Tijera";
                break;
            default:
                resultado = "Error";
        }
        //muestra la eleccion
        System.out.println(resultado);
    }
}

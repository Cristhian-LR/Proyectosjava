/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @author DELL
 */

import java.util.Random;

public class JuegoPiedraPaepelTijeras {

    public static void PlayGame(String[] args) {
        System.out.println("Vamos a jugar Piedra, Papel o Tijera");

        Random random = new Random();
        int opcion = random.nextInt(3);

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

        System.out.println(resultado);
    }
}

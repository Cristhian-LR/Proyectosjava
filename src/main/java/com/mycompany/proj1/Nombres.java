/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @author DELL
 */

public class Nombres {

    public static void main(String[] args) {
        String[] nombres = new String[14];
        nombres[0] = "jorge";
        nombres[1] = "sebas";
        nombres[2] = "mario";
        nombres[3] = "cristhian";
        nombres[4] = "sebasa";
        nombres[5] = "rodri";
        nombres[6] = "camila";
        nombres[7] = "oscar";
        nombres[8] = "carlo";
        nombres[9] = "cesar";
        nombres[10] = "rebecca";
        nombres[11] = "argel";
        nombres[12] = "leslie";
        nombres[13] = "jostin";

        System.out.println("Hello World!");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + nombres[i]);
        }
    }
}

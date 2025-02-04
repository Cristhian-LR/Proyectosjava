/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @author DELL
 */
public class NamesClass {
       public static void ShowNames() {
        String[] names = new String[14]; 
        names[0] = "jorge";
        names[1] = "sebas";
        names[2] = "mario";
        names[3] = "cristhian";
        names[4] = "sebasa";
        names[5] = "rodri";
        names[6] = "camila";
        names[7] = "oscar";
        names[8] = "carlo";
        names[9] = "cesar";
        names[10] = "rebecca";
        names[11] = "argel";
        names[12] = "leslie";
        names[13] = "jostin";

        System.out.println("Hello World!");

        for (int i = 0; i < names.length; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + names[i]);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ArrayListt {

    ArrayList<String> lenguages = new ArrayList<>();

    public void addLenguages(String lenguage) {
        lenguages.add(lenguage);
    }

    public int returnSize() {
        return lenguages.size();
    }

    public void removeLenguages(int lenguageIndex) {
        lenguages.remove(lenguageIndex);
    }

    public void editLenguages(int lenguageIndex) {
        if (lenguageIndex >= 0 && lenguageIndex < lenguages.size()) { // Validación
            lenguages.set(lenguageIndex, lenguages.get(lenguageIndex) + " (actualmente)");
        }
    }
    
    public void clearLenguages(){
        lenguages.clear();
    }
}

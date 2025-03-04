/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

import java.util.ArrayList;

/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 23-Feb-2025
 */
public class ArrayListExample {

    ArrayList<String> cars = new ArrayList<>();

    public void addCars(String car) {
        cars.add(car);
    }

    public int returnSize() {
        return cars.size();
    }

    public void removeCar(int carIndex) {
        cars.remove(carIndex);
    }
}

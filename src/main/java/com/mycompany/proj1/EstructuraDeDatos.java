/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

import com.mycompany.proj1.SecondPartial.InsertionSortExample;


/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186 
 * Fecha: 23-Feb-2025
 */
public class EstructuraDeDatos {

    public static void main(String[] args) {
        
        int peorCaso[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int mejorCaso[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Peor Caso:");
        int operacionesPeor = SelectionSortExample.selectionSort(peorCaso);
        for (int num : peorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesPeor);
        
        System.out.println("\nMejor Caso:");
        int operacionesMejor = SelectionSortExample.selectionSort(mejorCaso);
        for (int num : mejorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesMejor);
        
        /*int peorCaso[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int mejorCaso[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Peor Caso:");
        int operacionesPeor = InsertionSortExample.insertionSort(peorCaso);
        for (int num : peorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesPeor);
        
        System.out.println("\nMejor Caso:");
        int operacionesMejor = InsertionSortExample.insertionSort(mejorCaso);
        for (int num : mejorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesMejor);
        
        
        /*SalesWithDiscount objSalesWithDiscount = new SalesWithDiscount();
        System.out.println("el total es: "+ objSalesWithDiscount.totalWithDiscount());
        
        /*GradeCalculationPartial objGradeCalculationPartial = new GradeCalculationPartial();
        objGradeCalculationPartial.averageStatusFinal(args);
        
        /*RatingStatus objRatingStatus = new RatingStatus();
        objRatingStatus.PassOrFail(args);
        
        CalculateRating objCalculateRating = new CalculateRating();
        objCalculateRating.averageFinal(args);
        
        SumMatrix objSumMatrix = new SumMatrix();
        objSumMatrix.sum(args);
                
        SalesCalculation objSalesCalculation = new SalesCalculation();
        objSalesCalculation.salesCalculationIVA(args);
        
        ArrayListt objArrayList = new ArrayListt();
        objArrayList.addLenguages("Phyton");
        objArrayList.addLenguages("JAVA");
        objArrayList.addLenguages("JavaScript");
        objArrayList.addLenguages("C++");
        objArrayList.addLenguages("Ruby");
        objArrayList.removeLenguages(4);
        objArrayList.editLenguages(3);
        System.out.println("Tamaño del ArrayList:" + objArrayList.returnSize());
        objArrayList.clearLenguages();
        System.out.println("Tamaño del ArrayList:" + objArrayList.returnSize());

        ExerciseTypeNumber objExerciseTypeNumber =  new ExerciseTypeNumber();
        objExerciseTypeNumber.typeNumber(args);
        
        
        
        ArrayMemory objArrayMemory = new ArrayMemory();
        objArrayMemory.printunidimensionalArray(args);
        
        
        
        MultidimensionalArrays objMultidimensionalArrays = new MultidimensionalArrays();
        objMultidimensionalArrays.printbidimensionalArray();
        
        ArrayListExample objArrayList = new ArrayListExample();
        objArrayList.addCars("Mazda");
        objArrayList.addCars("ford");
        objArrayList.removeCar(0);
        objArrayList.returnSize();
        
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Ingresa el radio del círculo:");

        double radius = objScanner.nextDouble();

        AreaCircle objAreaCircle = new AreaCircle();
        double area = objAreaCircle.calculateArea(radius);

        // Imprimir correctamente con formato
        System.out.printf("El área del círculo es: %.2f%n", area);

        objScanner.close();

        UserData objUserData = new UserData();
        
        String fullName = objUserData.fullname("Cristhian", "Loya");
        System.out.println(fullName);
                
        // Calcular la calificación del parcial
        int partialGrade = objStudentGrades.calculatePartialGrade(85, 90);
        System.out.println("Calificación del parcial: " + partialGrade);
        
        // Calcular la calificación final del semestre
        int finalGrade = objStudentGrades.calculateFinalGrade(80, 75, 90, 85);
        System.out.println("Calificación final del semestre: " + finalGrade);

        // Verificar el estatus de asistencia
        String attendanceStatus = objStudentGrades.checkFailureByAbsences(64, 5);
        System.out.println(attendanceStatus); */
        
    }
}

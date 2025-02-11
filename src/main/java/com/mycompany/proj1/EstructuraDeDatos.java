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
public class EstructuraDeDatos {
    //public static void main(String[] args) {
        //UserData objUserData = new UserData();
        
        //String fullName = objUserData.fullname("Cristhian", "Loya");
        //System.out.println(fullName);
                
    
    public static void main(String[] args) {
        StudentGrades student = new StudentGrades();
        
        // Calcular la calificación del parcial
        int partialGrade = student.calculatePartialGrade(85, 90);
        System.out.println("Calificación del parcial: " + partialGrade);
        
        // Calcular la calificación final del semestre
        int finalGrade = student.calculateFinalGrade(80, 75, 90, 85);
        System.out.println("Calificación final del semestre: " + finalGrade);
        
        // Verificar el estatus de asistencia
        String attendanceStatus = student.checkFailureByAbsences(64, 5);
        System.out.println(attendanceStatus);
    }
}
   
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj1;

/**
 *
 * @autor: Cristhian Loya 
 * Matricula: 15186
 * Fecha: 11-Feb-2025
 */
public class StudentGrades {

    public int calculatePartialGrade(int examScore, int homeworkScore) {
        double firstPartialGrade = (examScore * .7) + (homeworkScore * .3);//calcula la calificacion parcial
        return (int) (firstPartialGrade);//se convierte a entero antes de devolver el resultado
    }

    public int calculateFinalGrade(int firstPartial, int secondPartial, int thirdPartial, int finalExam) {//recibe 4 parametros para obtener la calificacion final
        double averagePartials = (firstPartial + secondPartial + thirdPartial) / 3;
        double finalGrade = (averagePartials * .5) + (finalExam * .5);
        return (int) (finalGrade); //se convierte a entero antes de devolver el resultado
    }

    public String checkFailureByAbsences(int totalHours, int absences) {
        double absencePercentage = ((double)absences / (double) totalHours) * 100; //calcula el porcentaje de ausencias
        if (absencePercentage > 10) {//ciclo para calcular si el numero de faltas es mayor o menor al 10%
            return "El alumno esta reprobado por faltas.";
        } else {
            return "Alumno cumple con las asistencias minimas.";
        }
    }
}

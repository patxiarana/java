/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_5;

import java.util.Scanner;
/* 
La calificacion final de  un estudiante de informatica se calcula
con base a las calificaciones de cuatro aspectos, rendmiento acamdemico: participacion;
primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificacion final con
ponderaciones del 10% , 25%, 25%, y 40%, Hacer un programa que calcule e imprima
la calificacion final obtenida por un estudiante 
*/ 
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in) ;
    float  participacion, primerExamen,segundoExamen, examenFinal, notaFinal ;
    // Pedir los datos al usuario
    System.out.println("Digite nota de partipacion");
    participacion = entrada.nextFloat() ;
        System.out.println("Digite la nota del primer examen parcial");
        primerExamen = entrada.nextFloat();
         System.out.println("Digite la nota del segundo examen parcial");
         segundoExamen = entrada.nextFloat() ;
         System.out.println("Digite la nota del examen final");
         examenFinal = entrada.nextFloat() ; 
         
         participacion *= 0.10 ; 
         primerExamen *= 0.25 ;
         segundoExamen *= 0.25 ;
         examenFinal *= 0.40 ;
         
         notaFinal = participacion + primerExamen + segundoExamen + examenFinal ;
         
         // imprimiar el resultado final 
         
         System.out.println("La nota final es" + notaFinal);
    }
}

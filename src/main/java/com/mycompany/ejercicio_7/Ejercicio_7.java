/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_7;

import java.util.Scanner;

/*Construir un programa que dado un numero total de horas, devuelve el numero de semanas
dias  y horas equivalentes.Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas, 6 dias y
16 horas */
public class Ejercicio_7 {

    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in) ; 
    int horasTotales, semanas, dias, horas ;
        System.out.println("Digite el numero de horas!");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168 ;
        
        dias = horasTotales%168 / 24 ;
        
        horas = horasTotales % 24 ;
        
        System.out.println("\n El equivalente es:" );
        System.out.println("Semana:" + semanas);
        System.out.println("dais:" + dias);
        System.out.println("Horas:" + horas);
    }
}

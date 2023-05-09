/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_6;

import java.util.Scanner;

/**
Hacer un programa que calcule el cuadrado de una suma 
* (a + b)2 = a2 + b2 + 2ab
 */
public class Ejercicio_6 {
/* Hacer un programa que calcule el cuadrado de una suma*/ 
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in) ;
        int primerNumero , segundoNumero , suma ;
       double total ;
        System.out.println("Ingrese el primer numero");
        primerNumero = entrada.nextInt() ;
        System.out.println("Ingrese el segundo numero");
        segundoNumero = entrada.nextInt() ;
        suma = primerNumero + segundoNumero ;
        
        total = Math.pow(suma,2 ) ;
        
        System.out.println("La suma de"+ primerNumero+ "y" + segundoNumero + "elevado al cubo es"+ total);
         }
}

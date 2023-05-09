/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fourproyect;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FourProyect {

    public static void main(String[] args) {
        // Operadores Aritmeticos 
        
        Scanner entrada = new Scanner(System.in) ;
        
        float numero1 , numero2, suma,resta,mult,div,resto ;
        
        
        System.out.println("digite dos numeros");
        
        numero1 = entrada.nextFloat() ;
         numero2 = entrada.nextFloat() ;
        
        
       suma = numero1 + numero2 ;
       
        resta = numero1 - numero2 ;
        
        mult = numero1 * numero2 ;
        
        div = numero1 / numero2 ;
        
        resto = numero1 % numero2 ;
        
        System.out.println("La suma es" +  suma);
        System.out.println("la resta es " + resta);
        System.out.println("La mult es" + mult);
        System.out.println("La div es " + div);
        System.out.println("El resto es " + resto);
    }
}

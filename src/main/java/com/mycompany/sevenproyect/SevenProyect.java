/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sevenproyect;

/**
 *
 * @author Usuario
 */
public class SevenProyect {
//Clase Math 
    public static void main(String[] args) {
        // Saco la raiz cuadrada sqrt
        double raiz = Math.sqrt(9) ; // El sqrt de la clase math funciona solo on double
        
        int raiz1 = (int)Math.sqrt(9) ; // transformo el double a int 
         double raiz2 = Math.sqrt(37.4) ;
        
     /*   System.out.println(raiz);
           System.out.println(raiz1);
             System.out.println(raiz2); */
             // Elevo por un exponente pow 
             
             double base = 5 , exponente = 2 ;
             double base2 = 4 , exponente2 = 3 ;
             
             double resultado = Math.pow(base,exponente) ;
             double resultado2 = Math.pow(base2,exponente2) ;
           /*  
             System.out.println(resultado2);
             System.out.println(resultado); */
           
           // Redondeo  un numero  round
           double numero = 5.46 ;
           float numero1 = 7.89f ;
            long result = Math.round(numero) ; // Si la variable es tipo double la guardo en un log
            int result2 = Math.round(numero1) ; // Si la variable es de tipo float la guardo en un int 
            
        /*    System.out.println(result);
            System.out.println(result2); */
             
             
             // Creo un numero random con random 
             
             
            double random = Math.random() ;
             
             System.out.println(random);
             
             
    }
}

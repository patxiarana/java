/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secondproyect;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SecondProyect {

    public static void main(String[] args) {
        /// Constantes /// 
     //final  int numero = 10 ; // Constante 
          //  numero = 15 ;
         //  Entrada de Datos 
           Scanner entrada = new Scanner(System.in) ;
       //   int numero ;
   //    float numero ;
    //   double numero ;
    char letra ;
    
     // String cadena ;
          System.out.println("Digite un numero o cadena :" );
        //   numero = entrada.nextInt() ;
         // numero = entrada.nextFloat();
       //  numero = entrada.nextDouble() ;
      // cadena = entrada.next() ;
    //  cadena = entrada.nextLine();
    letra = entrada.next().charAt(0) ; 
        //  System.out.println("El numero es" + numero);
     //  System.out.println("La cadena es " + cadena) ;
         System.out.println("La cadena es " + letra) ;
    }
}

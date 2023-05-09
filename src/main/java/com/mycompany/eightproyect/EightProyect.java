// Ejercicio 1 : Hacer un programa que calcule e imprima la suma de 3 calificaciones 

package com.mycompany.eightproyect;

import java.util.Scanner;

public class EightProyect {

    public static void main(String[] args) {
        
        //Ejercicio 3 Calcular la paga semanal de un
        //empleado con el pago por hora y la cantidad de horas semanales trabajadas
        
   /*     Scanner entrada = new Scanner(System.in) ;
          float nota1, nota2, nota3, suma ;
         
          // Guardamos las 3 notas 
        System.out.println("Digite  3 Calificaciones");
        nota1 = entrada.nextFloat() ;
        nota2 = entrada.nextFloat() ;
        nota3 = entrada.nextFloat() ;
        
        suma = nota1 + nota2 + nota3 ;
       System.out.println("\n La suma es "+ suma );*/
    /* Scanner entrada = new Scanner(System.in) ; 
        int PagoPorHora, HorasSemanales, mult ;
        
        System.out.println("Ingrese el pago por hora y las horas semanales");
        
        PagoPorHora = entrada.nextInt();
        HorasSemanales = entrada.nextInt();
        
        mult = PagoPorHora * HorasSemanales ;
        
        System.out.println("\n el pago total es de " + mult); */
    
    /* Ejercicio 3: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee guillermo
    Juan tiene la mitad de lo que poseen luis y guillermo juntos. Hacer un programa que calcule e imprima
    la cantidad de dinero que tienen entre los 3 */
    
        Scanner entrada = new Scanner(System.in) ;
        
        float guillermo, juan, luis, total; 
        
        System.out.println("Digite la cantidad de dinero de Guillermo");
        
       guillermo = entrada.nextFloat(); 
       
       luis = guillermo/2 ;
               
         juan = (guillermo + luis) / 2 ;
         
           total = guillermo + luis + juan ;
           
           System.out.println("La cantidad de dinero es " + total);
    }
}

/*Una compañia de Venta de carros usados, paga a su personal de ventas un salario de 
1000 mensuales, mas una comision de 150 por cada carro vendido, mas el %5 del valor de la venta
por carro.Cada mes el Capturista de la empresa ingresa en la computadora los datos pertinentes.Hacer un programa
que calcule e imprima el salario mensual del vendedor*/ 

package com.mycompany.ejercicio_4;

import java.util.Scanner;



public class Ejercicio_4 {

    public static void main(String[] args) {
        
        int CarrosVendidos, ValorTotalVentas, PorcentajeVentas,ComisionTotal,SalarioTotal ;
        
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("Ingrese la cantidad de carros vendidos y el valor total de las ventas");
    
        CarrosVendidos = entrada.nextInt() ;
        ValorTotalVentas = entrada.nextInt() ;
        
        ComisionTotal =  CarrosVendidos * 150 ;
        PorcentajeVentas = (ValorTotalVentas * 5 ) / 100 ;
        
       SalarioTotal = ComisionTotal + PorcentajeVentas + 1000 ;
        
        
        System.out.println("El Slario Total es de " + SalarioTotal);
    }
}

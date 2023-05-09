/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threproyect;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ThreProyect {

    public static void main(String[] args) {
        
        /// Entrada y salida de Datos con JobOptions
        
        String Cadena ;
        int Entero ;
        char letra ;
        double decimal ;
        
        
        
        Cadena = JOptionPane.showInputDialog("Digite una cadena");
        Entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero")) ; 
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimal"));
        
        JOptionPane.showMessageDialog(null,"la cadena es" + Cadena);
        
         JOptionPane.showMessageDialog(null,"EL entero es " + Entero ) ;
          JOptionPane.showMessageDialog(null, "letra" + letra );
           JOptionPane.showMessageDialog(null,"la cadena es" + Cadena);
            JOptionPane.showMessageDialog(null,"el decimal es " + decimal) ; 
        
        
        
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec01.introprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class Tarea1 {

    private static String n;

     public static void main(String[] args) {
   
      
    String Nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
    
    String Salariostring = JOptionPane.showInputDialog("Ingrese su salario semanal sin deducciones");
                                      
    Integer Salario = Integer.parseInt(Salariostring);
    
    double Salaribruto = Salario * 4;
    double Salarided = Salaribruto * 0.0934;
    double Salarioneto = Salaribruto - Salarided;
    
    JOptionPane.showMessageDialog(null, "Estimado <<"+Nombre +">>, el salario de este mes se desglosa de la siguiente manera:" +  " Salario Bruto: " + Salaribruto + " Deducciones: "+ Salarided + "Salario Neto: " + Salarioneto);
   
    }
    
}

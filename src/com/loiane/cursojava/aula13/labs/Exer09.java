package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exer09 {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);

            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "9 - Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.");
        
            System.out.print("Informe a temperatura em ºF: ");
            double tempFahrenheit = scan.nextDouble();
            
            double  tempCelsius = 5 * ((tempFahrenheit - 32) / 9);
            
            System.out.println("A temperatura informada corresponde a " + tempCelsius + " ºC.");
        
        scan.close();
    }
}

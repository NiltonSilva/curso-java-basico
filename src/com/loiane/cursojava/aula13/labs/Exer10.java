package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exer10 {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);

            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "10 - Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.");
        
            System.out.print("Informe a temperatura em ºC: ");
            double tempCelsius = scan.nextDouble();
            
            double tempFahrenheit = ((tempCelsius * 9) / 5) + 32;
            
            System.out.println("A temperatura informada corresponde a " + tempFahrenheit + " ºF.");
        
        scan.close();
    }
}

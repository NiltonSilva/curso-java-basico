package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exer08 {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);

            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "8 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.");
        
            System.out.print("Informe o valor da hora trabalhada: ");
            double valorHora = scan.nextDouble();
            
            System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
            int horasTrabalhada = scan.nextInt();
            
            double salario = valorHora * horasTrabalhada;
            
            System.out.println("O salário a receber neste mês é de: " + salario);
        
        scan.close();
    }
}

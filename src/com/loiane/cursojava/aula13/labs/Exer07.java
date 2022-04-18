package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exer07 {
        public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "7 - Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.");
        
        System.out.print("Entre com o lado do quadrado: ");
        double lado = scan.nextDouble();
        
        double area = lado * lado;
        double dobroArea = area * 2;
        
        System.out.println("O dobro da área é " + dobroArea);
        
        scan.close();
    }
}

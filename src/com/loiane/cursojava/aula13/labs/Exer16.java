package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer16 {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);
            
            JOptionPane.showMessageDialog(null, "Aula 13 - Questão 16:");
            
            double AUTONOMIA_LATA_TINTA = 54;
            double PRECO_TINTA = 80;
            
            System.out.print("Informe a área do ambiente: ");
            double area = scan.nextDouble();
            double qdadeTinta = Math.ceil(area / AUTONOMIA_LATA_TINTA);
            double valorPagamento = qdadeTinta * PRECO_TINTA;
            
            System.out.printf("Você precisará de %.0f lata(s) de tinta(s).\n", qdadeTinta);
            System.out.printf("O valor a ser pago é de R$ %.2f.", valorPagamento);
            
            
            scan.close();
    }
}

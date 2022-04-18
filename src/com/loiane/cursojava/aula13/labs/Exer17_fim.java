package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer17_fim {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);
            
            JOptionPane.showMessageDialog(null, "Aula 13 - Questão 16:");
            
            double AUTONOMIA_LATA_TINTA_G = 108;
            double AUTONOMIA_LATA_TINTA_P = 21.6;
            double PRECO_TINTA_G = 80;
            double PRECO_TINTA_P = 25;
            
            System.out.print("Informe a área do ambiente: ");
            double area = scan.nextDouble();
            
            double qdadeTintaG = Math.ceil(area / AUTONOMIA_LATA_TINTA_G);
            double qdadeTintaP = Math.ceil(area / AUTONOMIA_LATA_TINTA_P);
            
            if(area < 64.8) {
            	System.out.printf("Você precisará de %.0f lata(s) de tinta(s) pequenas.\n", qdadeTintaP);
            } else {
            	System.out.printf("Você precisará de %.0f lata(s) de tinta(s) grandes.\n", qdadeTintaG);
            }
                
            scan.close();
    }
}

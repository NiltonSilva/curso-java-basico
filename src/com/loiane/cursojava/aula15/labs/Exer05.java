
package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.print("Informe a primeira nota: ");
            double primeiraNota = scan.nextDouble();
            System.out.print("Informe a segunda nota: ");
            double segundaNota = scan.nextDouble();
            
            double media = (primeiraNota + segundaNota) / 2;
            
            if(media == 10){
                System.out.println("APROVADO COM DISTINÇÃO");
            } else if(media >= 7){
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }

            
        scan.close();
    }
}

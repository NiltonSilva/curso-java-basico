package com.loiane.cursojava.aula13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer13 {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);
            
            double pesoIdeal;
            
            System.out.print("Informe sua altura: ");
            double altura = scan.nextDouble();
            System.out.print("Informe o gênero: ");
            String genero = scan.next();
            
            DecimalFormat df = new DecimalFormat("##,##.##");
            
            if(genero.equalsIgnoreCase("m")){
                pesoIdeal = (72.7 * altura) - 58;
                System.out.println("Seu peso ideal é: " + df.format(pesoIdeal));
            } else if (genero.equalsIgnoreCase("f")){
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.println("Seu peso ideal é: " + df.format(pesoIdeal));
            } else {
                System.out.println("Gênero inválido.");
            }
        
            scan.close();
    }
}

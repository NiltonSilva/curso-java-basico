package com.loiane.cursojava.aula13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer12 {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Informe sua altura: ");
            double altura = scan.nextDouble();
            
            double pesoIdeal = (72.7 * altura) - 58;
            
            DecimalFormat df = new DecimalFormat("##,##.##");
            
            System.out.println("Seu peso ideal é " + df.format(pesoIdeal));
        
            scan.close();
    }
}

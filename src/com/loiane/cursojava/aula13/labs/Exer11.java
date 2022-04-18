package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Informe o primeiro número inteiro: ");
            int primInteiro = scan.nextInt();
            System.out.print("Informe o segundo número inteiro: ");
            int segInteiro = scan.nextInt();
            System.out.print("Informe o número real: ");
            double numReal = scan.nextDouble();
            
            System.out.println("O produto do dobro do primeiro com metade do segundo = " + (primInteiro * 2) * (segInteiro / 2));
            System.out.println("A soma do triplo do primeiro com o terceiro: " + ((primInteiro * 3) + numReal));
            System.out.println("O terceiro elevado ao cubo: " + Math.pow(numReal, 3));
        
            scan.close();
    }
}

package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o primeiro valor: ");
        int primNumero = scan.nextInt();
        System.out.print("Informe o segundo valor: ");
        int segNumero = scan.nextInt();
        
        int maiorNumero = primNumero;
        
        if(segNumero > maiorNumero){
            maiorNumero = segNumero;
            System.out.println("O maior número é " + maiorNumero);
        } else {
            System.out.println("O maior número é " + maiorNumero);
        }
        
        scan.close();
    }
}

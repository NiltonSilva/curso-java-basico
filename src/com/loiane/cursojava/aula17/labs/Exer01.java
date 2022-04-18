package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double nota;
        
        System.out.print("Informe uma nota entre 0 e 10: ");
        
        do {
            nota = scan.nextDouble();
            if(nota < 0 || nota > 10){
                System.out.print("NOTA INVÁLIDA! Informe uma nota entre 0 e 10: ");
            }
        }while(nota < 0 || nota > 10);
        
        System.out.println("A nota informada foi: " + nota);
        
        scan.close();
        
    }
}

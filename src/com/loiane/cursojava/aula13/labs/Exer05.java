package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informa a medida(M): ");
        double medida = scan.nextDouble();
        
        System.out.println("A medida em CM é " + (medida * 100));
        
        scan.close();
    }
    
}
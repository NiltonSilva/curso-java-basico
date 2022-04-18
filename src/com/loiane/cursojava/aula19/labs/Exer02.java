package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[] args){
            
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com o " + (i+1) +"º elemento do vetor A: ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }
        
        System.out.println("VETOR A:");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println("\n\nVETOR B:");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
 
}

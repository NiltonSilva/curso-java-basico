package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer10 {
    
    public static void main(String[] args){
            
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Informe o " + (i + 1) + "º elemento do vetor A: ");
            vetorA[i] = scan.nextInt();
        }
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] % 2;
        }
             
        System.out.println("VETOR A");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nVETOR B");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }           
    }
}

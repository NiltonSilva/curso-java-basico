package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer06 {
    
    public static void main(String[] args){
            
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Informe o " + (i + 1) + "º elemento do vetor A: ");
            vetorA[i] = scan.nextInt();
        }
        for(int i = 0; i < vetorB.length; i++){
            System.out.print("Informe o " + (i + 1) + "º elemento do vetor B: ");
            vetorB[i] = scan.nextInt();
        }
        
        for(int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        
        System.out.print("VETOR A: ");
        for(int vetor : vetorA){
            System.out.print(vetor + " ");
        }
        System.out.print("\nVETOR B: ");
        for(int vetor : vetorB){
            System.out.print(vetor + " ");
        }
        System.out.print("\nVETOR C: ");
        for(int vetor : vetorC){
            System.out.print(vetor + " ");
        }
        
        /*
        System.out.println("VETOR A");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nVETOR B");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("\nVETOR C");
        for(int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        */
    }
}

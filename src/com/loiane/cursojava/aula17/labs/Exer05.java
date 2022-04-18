package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int pais_A;
        double crescimentoPais_A;
        int pais_B;
        double crescimentoPais_B;
        int qdadeAnos = 0;
        boolean valido = false;
        
        do {
            System.out.print("Informe a população do país A: ");
            pais_A = scan.nextInt();
            if(pais_A > 0){
                valido = true;
            } else {
                System.out.println("A população do país precisa ser maior que 0.");
            }
        } while(!valido);
        
        valido = false;
        
        do {
            System.out.print("Informe a população do país B: ");
            pais_B = scan.nextInt();
            if(pais_B > 0){
                valido = true;
            } else {
                System.out.println("A população do país precisa ser maior que 0.");
            }
        } while(!valido);
        
        valido = false;
        
        do {
            System.out.print("Informe a taxa de crescimento do país A: ");
            crescimentoPais_A = scan.nextDouble();
            if(crescimentoPais_A > 0){
                valido = true;
            } else {
                System.out.println("A taxa de crescimento do país precisa ser maior que 0.");
            }
            
        } while(!valido);
        
        valido = false;
        
        do {
            System.out.print("Informe a taxa de crescimento do país B: ");
            crescimentoPais_B = scan.nextDouble();
            if(crescimentoPais_B > 0){
                valido = true;
            } else {
                System.out.println("A taxa de crescimento do país precisa ser maior que 0.");
            }
            
        } while(!valido);
        
        while(pais_A < pais_B){
            pais_A += (pais_A/100) * crescimentoPais_A;
            pais_B += (pais_B/100) * crescimentoPais_B;
            qdadeAnos++;
        }
       
        System.out.println("A quantidade de anos para que o país A fosse maior que de " + qdadeAnos + " anos.");
        scan.close();
    }
}

package com.loiane.cursojava.aula17.labs;

public class Exer04 {
    
    public static void main(String[] args){
        
        int pais_A = 80000;
        int pais_B = 200000;
        double crescimentoPais_A = 1.03;
        double crescimentoPais_B = 1.015;
        int qdadeAnos = 0;
        
        while (pais_A < pais_B){
            pais_A *= crescimentoPais_A;
            pais_B *= crescimentoPais_B;
            qdadeAnos++;
        }
        
        System.out.println("Foi necessário " + qdadeAnos + " anos para que o pais B fosse mais populoso.");
       
    }
}


package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.print("Digite 'F' ou 'M': ");
            String sexo = scan.next();
        
            if(sexo.equalsIgnoreCase("F")){
                System.out.println("Feminino");
            } else if (sexo.equalsIgnoreCase("M")){
                System.out.println("Masculino");
            } else {
                System.out.println("Sexo inválido");
            }
        scan.close();
    }
}

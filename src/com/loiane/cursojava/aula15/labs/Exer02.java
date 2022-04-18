
package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.print("Informe um número: ");
            int numero = scan.nextInt();
            
            if(numero % 2 == 0){
                System.out.println("O número é PAR");
            } else {
                System.out.println("O número é ÍMPAR");
            }
        
        scan.close();
    }
}

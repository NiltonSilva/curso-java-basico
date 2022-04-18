
package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.print("Entre com o primeiro numero: ");
            int num1 = scan.nextInt();
            System.out.print("entre com o segundo numero: ");
            int num2 = scan.nextInt();
            System.out.print("Entre com o terceiro numero: ");
            int num3 = scan.nextInt();
            
            if(num1 >= num2 && num1 >= num3){
                System.out.println("O primeiro número é o maior " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("O segundo número é o maior " + num2);
            } else if (num3 >= num1 && num3 >= num2) {
                System.out.println("O terceiro número é o maior " + num3);
            }
        scan.close();
    }
}

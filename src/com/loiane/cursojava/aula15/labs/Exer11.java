package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double salario;
        int percentual;
        
        System.out.print("Entre com o sal?rio atual: ");
        salario = scan.nextDouble();
        
        if(salario <= 280) {
        	percentual = 20;
        } else if (salario > 280 && salario <= 700) {
        	percentual = 15;
        } else if (salario > 700 && salario <= 1500) {
        	percentual = 10;
        } else {
        	percentual = 5;
        }
        
        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;
        
        System.out.println("\n********** INFORMA??ES DO FUNCION?RIO **********");
        System.out.println("Sal?rio: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Sal?rio ajustado: " + salarioAjustado);
        
        scan.close();
    }
}

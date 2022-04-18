package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double salarioBruto;
        int percentualIR;
        
        System.out.print("Informe o valor trabalho/hora: ");
        double valorHora = scan.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        double qtdHoras = scan.nextDouble();
        
        salarioBruto = valorHora * qtdHoras;
        
        if(salarioBruto <= 900) {
        	percentualIR = 0;
        } else if(salarioBruto > 900 &&  salarioBruto <= 1500) {
        	percentualIR = 5;
        } else if(salarioBruto > 1500 && salarioBruto <= 2500) {
        	percentualIR = 10;
        } else {
        	percentualIR = 20;
        }
        
        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + "): " + salarioBruto );
        System.out.println("(-) IR (" + percentualIR + "%):" + ir);
        System.out.println("(-) INSS (10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário Líquido: " + salarioLiquido);
        
        scan.close();
    }
}

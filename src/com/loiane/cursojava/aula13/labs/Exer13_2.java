package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13_2 {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);           
            
            System.out.print("Informe o valor ganho por hora: ");
            double valorHora = scan.nextDouble();
            System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
            int qtdHorasMes = scan.nextInt();
            
            double salarioBruto = valorHora * qtdHorasMes;
            double descontoIR = salarioBruto / 100 * 11;
            double descontoINSS = salarioBruto / 100 * 8;
            double descontoSindicato = salarioBruto / 100 * 5;
            double salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindicato;
            
            System.out.println("SALÁRIO BRUTO: " + salarioBruto);
            System.out.println("DESCONTO INSS: " + descontoINSS);
            System.out.println("DESCONTO IMPORTO DE RENDA: " + descontoIR);
            System.out.println("DESCONTO SINDICATO: " + descontoSindicato);
            System.out.println("SALÁRIO LÍQUIDO: " + salarioLiquido);
            
            scan.close();
    }
}

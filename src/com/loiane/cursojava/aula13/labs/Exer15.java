package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer15 {
        public static void main(String[] args){
        
            Scanner scan = new Scanner(System.in);
            
            JOptionPane.showMessageDialog(null, "Aula 13 - Questão 15:");
            
            System.out.print("Informe o valor R$/hora: ");
            double valorHora = scan.nextDouble();
            System.out.print("Informe o total de horas trabalhadas no mês: ");
            int qtdHoras = scan.nextInt();
            
            double salarioBruto = valorHora * qtdHoras;
            double ir = salarioBruto * 0.11;
            double inss = salarioBruto * 0.08;
            double sindicato = salarioBruto * 0.05;
            double totalDescontos = ir + inss + sindicato;
            double salarioLiquido = salarioBruto -  totalDescontos;
            
            System.out.println();
            System.out.println("************* RELATÓRIO DE PAGAMENTO *************");
            System.out.printf("+ Salário Bruto:                         R$ %6.2f\n", salarioBruto);
            System.out.printf("- IR:                                    R$ %6.2f\n", ir);
            System.out.printf("- INSS:                                  R$ %6.2f\n", inss);
            System.out.printf("- Sindicato:                             R$ %6.2f\n", sindicato);
            System.out.printf("- Total de descontos:                    R$ %6.2f\n", totalDescontos);
            System.out.printf("= Salário Líquido:                       R$ %6.2f\n", salarioLiquido);
            System.out.println("**************************************************");
            
            /*
            String sb = "Salário Bruto";
            String ir2 = "IR";
            String inss2 = "INSS";
            System.out.printf("+ %-20s: R$%10.2f\n", sb, salarioBruto);
            System.out.printf("- %-20s: R$%10.2f\n", ir2, ir);
            System.out.printf("- %-20s: R$%10.2f\n", inss2, inss);
            */
                        
            scan.close();
    }
}

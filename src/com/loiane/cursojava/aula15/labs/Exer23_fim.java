package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer23_fim {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Aula 15 - Questão 23");
		
		double FILE_DUPLO = 4.9;
		double ALCATARA = 5.9;
		double PICANHA = 6.9;
		String tipoCarne;
		double precoParcial = 0;
		double precoDesconto = 0;
		double desconto = 0;
		double peso;
		String formaPagamento;
		
		System.out.print("Qual tipo de carne deseja comprar (F-Filé / A - Alcatara / P - Picanha)? ");
		tipoCarne = input.next();
		System.out.print("Informe a quantidade: ");
		peso = input.nextDouble();
		
		if(tipoCarne.equalsIgnoreCase("f")) {
			tipoCarne = "Filé Duplo";
			if(peso < 5) {
				precoParcial = FILE_DUPLO * peso;
			} else {
				precoParcial = (FILE_DUPLO + 0.9) * peso;
			}
		} else if(tipoCarne.equalsIgnoreCase("a")) {
			tipoCarne = "Alcatara";
			if(peso < 5) {
				precoParcial = ALCATARA * peso;
			} else {
				precoParcial = (ALCATARA + 0.9) * peso;
			}
		} else if (tipoCarne.equalsIgnoreCase("p")) {
			tipoCarne = "Picanha";
			if(peso < 5) {
				precoParcial = PICANHA * peso;
			} else {
				precoParcial = (PICANHA + 0.9) * peso;
			}
		} else {
			System.out.println("Opção de carne incorreta.");
		}
		
		System.out.print("\nQual a forma de pagamento (C - Cartão / D - Dinheiro)? \n");
		formaPagamento = input.next();
		
		/* IMPRESSÃO DO CUPOM FISCAL */
		System.out.println("************* CUPOM FISCAL *************");
		System.out.printf("TIPO DE CARNE: %s\n", tipoCarne);
		System.out.printf("QTDE DE CARNE: %.2f quilos\n", peso);
		if(formaPagamento.equalsIgnoreCase("c")) {
			formaPagamento = "Cartão";
			desconto = precoParcial * 0.05;
			precoDesconto = precoParcial - desconto;
			System.out.printf("PREÇO INTEGRAL: R$ %.2f\n", precoParcial);
			System.out.printf("FORMA PGMTO: %s\n", formaPagamento);
			System.out.printf("VALOR DESCONTO: R$ %.2f\n", desconto);
			System.out.printf("VALOR A PAGAR: R$ %.2f\n", precoDesconto);
		} else {
			formaPagamento = "Dinheiro";
			System.out.printf("PREÇO INTEGRAL: R$ %.2f\n", precoParcial);
			System.out.printf("FORMA PGMTO: %s\n", formaPagamento);
		}
		System.out.println("****************************************");
		
		input.close();
	}
}
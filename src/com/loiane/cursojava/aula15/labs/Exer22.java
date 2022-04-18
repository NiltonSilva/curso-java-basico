package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Aula 15 - Questão 22");
		
		String fruta;
		double peso = 0;
		double pesoTotal = 0;
		double PRECO_MORANGO = 2.5;
		double PRECO_MACA = 1.8;
		double valorParcial = 0;
		double valorPagamento = 0;
		double valorComDesconto = 0;
		String continuar = "s";
		
		do {
			System.out.print("Informe qual é a fruta (S-Strawberry / A-Apple): ");
			fruta = input.next();
			System.out.print("Informe o peso: ");
			peso = input.nextDouble();
			if(fruta.equalsIgnoreCase("s")) {
				if(peso <= 5) {
					valorParcial = PRECO_MORANGO * peso;
				} else {
					valorParcial = (PRECO_MORANGO - 0.3) * peso;
				}
			} else if (fruta.equalsIgnoreCase("a")) {
				if(peso <= 5) {
					valorParcial = PRECO_MACA * peso;
				} else {
					valorParcial = (PRECO_MACA - 0.3) * peso;
				}
			}
			
			valorPagamento = valorPagamento + valorParcial;
			pesoTotal = peso + pesoTotal;
			System.out.print("Deseja acrescentar mais frutas (S/N)? ");
			continuar = input.next();
		} while(continuar.equalsIgnoreCase("s"));
		
		if(pesoTotal > 8 || valorPagamento > 25) {
			valorComDesconto = valorPagamento * 0.9;
			System.out.printf("O valor total do pagamento é de R$ %.2f", valorComDesconto);
		} else {
			System.out.printf("O valor total do pagamento é de R$ %.2f", valorPagamento);
		}
		
		input.close();
	}

}

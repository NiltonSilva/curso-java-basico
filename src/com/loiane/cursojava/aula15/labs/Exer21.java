package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Aula 15 - Questão 21");
		
		double VALOR_GASOLINA = 2.5;
		double VALOR_ALCOOL = 1.9;
		double valorFinal = 0;
		double desconto;
		
		
		System.out.print("Qual combustível (G/A)? ");
		String combustivel = input.next();
		System.out.print("Informe a quantidade: ");
		double qtdade = input.nextDouble();
		
		if(combustivel.equalsIgnoreCase("g")) {
			if (qtdade < 20) {
				desconto = 0.96;
				valorFinal = (VALOR_GASOLINA * qtdade) * desconto;
			} else {
				desconto = 0.94;
				valorFinal = (VALOR_GASOLINA * qtdade) * desconto;
			}
		} else if(combustivel.equalsIgnoreCase("a")) {
			if(qtdade < 20) {
				desconto = 0.97;
				valorFinal = (VALOR_ALCOOL * qtdade) * desconto;
			} else {
				desconto = 0.95;
				valorFinal = (VALOR_ALCOOL * qtdade) * desconto;
			}
		} else {
			System.out.println("Tipo de combustível inválido");
		}

		System.out.println("O valor que deve ser pago é R$ " + valorFinal);
		
		input.close();
	}

}

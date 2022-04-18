package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int primeiroNumero = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int segundoNumero = scan.nextInt();
		
		double resultado = 0;
		boolean valida = true;
		
		System.out.print("Qual operação você deseja realizar? ");
		char operacao = scan.next().charAt(0);
		
		switch (operacao) {
			case '+':
				resultado = primeiroNumero + segundoNumero;
				break;
			case '-':
				resultado = primeiroNumero - segundoNumero;
				break;
			case '*':
				resultado = primeiroNumero * segundoNumero;
				break;
			case '/':
				resultado = primeiroNumero / segundoNumero;
				break;
			default:
				System.out.println("Operação inválida.");
				valida = false;
		}
		
		if(valida) {
			System.out.println("Resultado = " + resultado);
			
			if(resultado >= 0) {
				System.out.println("Resultado positivo");
			} else {
				System.out.println("Resultado negativo");
			}
			
			if(resultado % 2 == 0) {
				System.out.println("Número par");
			} else {
				System.out.println("Número ímpar");
			}
		}
		
		scan.close();

	}

}

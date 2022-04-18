package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int primeiroNumero = scan.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int segundoNumero = scan.nextInt();
		
		double resultado = 0;
		boolean valida = true;
		
		System.out.print("Qual opera��o voc� deseja realizar? ");
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
				System.out.println("Opera��o inv�lida.");
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
				System.out.println("N�mero par");
			} else {
				System.out.println("N�mero �mpar");
			}
		}
		
		scan.close();

	}

}

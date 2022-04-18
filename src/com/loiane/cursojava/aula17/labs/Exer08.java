package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		int number1 = scan.nextInt();
		System.out.print("Informe o segundo numero: ");
		int number2 = scan.nextInt();
		System.out.print("Informe o terceiro numero: ");
		int number3 = scan.nextInt();
		System.out.print("Informe o quarto numero: ");
		int number4 = scan.nextInt();
		System.out.print("Informe o quinto numero: ");
		int number5 = scan.nextInt();
		
		int soma = number1 + number2 + number3 + number4 + number5;
		
		double media = soma / 5;
		
		System.out.println();
		System.out.printf("A média dos 5 números é %.2f.", media);
		
		scan.close();

	}

}

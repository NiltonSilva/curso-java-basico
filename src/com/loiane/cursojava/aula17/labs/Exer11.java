package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		JOptionPane.showMessageDialog(null, "Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendidos entre eles somando-os.");
		
		System.out.print("Informe o primero número: ");
		int number1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int number2 = scan.nextInt();
		
		for(int i = number1+1; i < number2; i++) {
			System.out.print(i + " ");
			soma += i;
		}
		
		System.out.print("\n\nA soma dos números é " + soma);
		
		scan.close();

	}

}

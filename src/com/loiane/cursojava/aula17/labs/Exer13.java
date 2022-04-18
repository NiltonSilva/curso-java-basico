package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Faça um programa que receba dois números, base e expoente, calcule e mostre o primeiro elevado ao segundo número. Não utilize a função de potência da linguagem.");
		
		int resultado = 1; 
		
		System.out.print("Informe o primero número: ");
		int number1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int number2 = scan.nextInt();
		
		
		
		for(int i = 1; i <= number2; i++) {
			resultado = resultado * number1;
		}
		
		System.out.println("resultado: " + resultado);

	}

}

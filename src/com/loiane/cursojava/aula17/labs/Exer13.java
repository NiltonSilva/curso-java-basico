package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Fa�a um programa que receba dois n�meros, base e expoente, calcule e mostre o primeiro elevado ao segundo n�mero. N�o utilize a fun��o de pot�ncia da linguagem.");
		
		int resultado = 1; 
		
		System.out.print("Informe o primero n�mero: ");
		int number1 = scan.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int number2 = scan.nextInt();
		
		
		
		for(int i = 1; i <= number2; i++) {
			resultado = resultado * number1;
		}
		
		System.out.println("resultado: " + resultado);

	}

}

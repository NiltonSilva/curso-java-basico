package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no intervalo compreendidos entre eles");
		
		System.out.print("Informe o primero n�mero: ");
		int number1 = scan.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int number2 = scan.nextInt();
		
		for(int i = number1+1; i < number2; i++) {
			System.out.print(i + " ");
		}
		
		scan.close();

	}

}

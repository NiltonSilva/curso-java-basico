package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendidos entre eles");
		
		System.out.print("Informe o primero número: ");
		int number1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int number2 = scan.nextInt();
		
		for(int i = number1+1; i < number2; i++) {
			System.out.print(i + " ");
		}
		
		scan.close();

	}

}

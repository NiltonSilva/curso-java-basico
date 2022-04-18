package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.");
		
		int numPares = 0;
		int numImpares = 0;
		int numero;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe o número: ");
			numero = scan.nextInt();
			if(numero % 2 != 0) {
				numImpares++;
			} else {
				numPares++;
			}
		}		
		
		System.out.println("A quantidade de número ímpares: " + numImpares);
		System.out.println("A quantidade de números pares: " + numPares);
		
		scan.close();

	}

}

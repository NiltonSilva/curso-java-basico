package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade de n�meros pares e a quantidade de n�meros impares.");
		
		int numPares = 0;
		int numImpares = 0;
		int numero;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe o n�mero: ");
			numero = scan.nextInt();
			if(numero % 2 != 0) {
				numImpares++;
			} else {
				numPares++;
			}
		}		
		
		System.out.println("A quantidade de n�mero �mpares: " + numImpares);
		System.out.println("A quantidade de n�meros pares: " + numPares);
		
		scan.close();

	}

}

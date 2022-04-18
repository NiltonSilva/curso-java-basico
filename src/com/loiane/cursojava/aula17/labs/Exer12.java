package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero entre 1 a 10. O usu�rio deve informar de qual n�mero ele deseja ver a tabuada.");
		
		System.out.print("Qual n�mero deseja saber a tabuada? ");
		int number = scan.nextInt();
		
		System.out.println("Tabuada de " + number);
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", number, i, (number*i));
		}
		
		scan.close();

	}

}

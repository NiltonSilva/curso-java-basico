package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer07 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Aula 17 - Questão 7");
		
		Scanner scan = new Scanner(System.in);
		
		int primNumero;
		int segNumero;
		int tercNumero;
		int quaNumero;
		int quiNumero;
		int maiorNumero;
		
		System.out.print("Informe o primeiro número: ");
		primNumero = scan.nextInt();
		maiorNumero = primNumero;
		System.out.print("Informe o segundo número: ");
		segNumero = scan.nextInt();
		
		if(segNumero > maiorNumero) {
			maiorNumero = segNumero;
		}
		System.out.print("Informe o terceiro número: ");
		tercNumero = scan.nextInt();
		if(tercNumero > maiorNumero) {
			maiorNumero = tercNumero;
		}
		System.out.print("Informe o quarto número: ");
		quaNumero = scan.nextInt();
		if(quaNumero > maiorNumero) {
			maiorNumero = quaNumero;
		}
		System.out.print("Informe o quinto número: ");
		quiNumero = scan.nextInt();
		if(quiNumero > maiorNumero) {
			maiorNumero = quiNumero;
		}
		System.out.println("O maior número é: " + maiorNumero);
		
		scan.close();
	}

}

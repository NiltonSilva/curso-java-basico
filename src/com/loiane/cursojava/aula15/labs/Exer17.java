package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("É ano bissexto");
			
		} else {
			System.out.println("Não é ano bissexto");
		}
		
		scan.close();

	}

}

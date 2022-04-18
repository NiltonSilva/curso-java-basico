package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Número par.");
		} else {
			System.out.println("Número ímpar");
		}
		
		scan.close();

	}

}

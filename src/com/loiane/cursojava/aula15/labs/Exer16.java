package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double delta, raizUm, raizDois;
		
		System.out.print("Informe o valor de A: ");
		int valorA = scan.nextInt();
		
		if(valorA == 0) {
			System.out.println("A equa��o n�o � do segundo grau.");
		} else {
			System.out.print("Informe o valor de B: ");
			int valorB = scan.nextInt();
			System.out.print("Informe o valor de C: ");
			int valorC = scan.nextInt();
			
			delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
			
			if(delta < 0) {
				System.out.println("Valor de delta: " + delta);
				System.out.println("A equa��o n�o possui valores reais.");
			} else if (delta == 0) {
				raizUm = (-valorB + Math.sqrt(delta)) / (2 * valorA);
				System.out.println("Valor de delta: " + delta);
				System.out.println("A equa��o possui apenas uma raiz: " + raizUm);
			} else {
				raizUm = (-valorB + Math.sqrt(delta)) / (2 * valorA);
				raizDois = (-valorB - Math.sqrt(delta)) / (2 * valorA);
				System.out.println("Valor de delta: " + delta);
				System.out.printf("A equa��o possui duas ra�zes. \nPrimeira raiz:  %.2f. Segunda ra�z: %.2f.\n", raizUm, raizDois);
			}
		}
		
		System.out.println("Programa finalizado.");
		
		scan.close();

	}

}

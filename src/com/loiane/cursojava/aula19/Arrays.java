package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// DECLARAÇÃO DO ARRAY. OBS: No Java devo obrigatoriamente indicar o número de posições do Array, diferente do JavaScript.
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 35;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: " + temperaturas);
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1) +" é: " + temperaturas[i]);
		}
		
		// FOR DIFERENTE PARA USAR NAS MATRIZES: crio uma variável com seu tipo + " : " + o vetor que vai ser lido. Nesse tipo de for eu não consigo ter acesso ao número do índice da matriz, somente ao valor.
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
		
		scan.close();

	}

}

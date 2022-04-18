package com.loiane.cursojava.aula20.labs;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exer02 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Aula17 - Q. 2) Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0 e 9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.");
		
		int[][] numerosAleatorios = new int[10][10];
		
		// OUTRA MANEIRA DE CRIAR NUMEROS ALEATORIOS
		Random numeroRandom = new Random();
		
		// Gerando a matriz
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
				
		// Imprimindo a matriz
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		// Detectando a maior número da linha 5
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				if(i == 5) {
					if(numerosAleatorios[i][j] > maior) {
						maior = numerosAleatorios[i][j];
					}
				}
			}
		}
		
		// Detectando o manor número da coluna 7
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				if(j == 7) {
					if(numerosAleatorios[i][j] < menor) {
						menor = numerosAleatorios[i][j];
					}
				}
			}
		}
		System.out.println("Maior numero da linha 5 = " + maior);
		System.out.println("Menor numero da coluna 7 = " + menor);

	}

}

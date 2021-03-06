package com.loiane.cursojava.aula20.labs;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exer01 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Aula17 - Q. 1) Gere e imprima uma matriz M 4x4 com valoers aleat?prios entre 0 e 9. Ap?s isso determine o maior n?mero da matriz e a sua poi??o (linha, coluna).");
		
		int[][] numerosAleatorios = new int[4][4];
		
		// OUTRA MANEIRA DE CRIAR NUMEROS ALEATORIOS
		Random numeroRandom = new Random();
		
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
	
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int col = 0;
		
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + col);

	}

}

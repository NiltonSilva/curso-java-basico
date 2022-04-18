package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " - ");
		}
		
		System.out.println("\nUSANDO O FOR EACH\n");
		for(int nota : notas) {	// o nome da entidade no singular e o nome do array a ser consultado no plutal
			System.out.print(nota + " - ");
		}
	}

}

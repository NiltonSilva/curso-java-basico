package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		System.out.println("\n***************\n");
		
		for(int i = 5; i > 0; i--) {
			System.out.println("i tem valor: " + i);
		}
		
		System.out.println("\n***************\n");
		
		System.out.println("USANDO FOR COM DUAS VARIÁVEIS\n");
		
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}

	}

}

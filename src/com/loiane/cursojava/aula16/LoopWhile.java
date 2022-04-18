package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1;	// COUNT ou CONT para usar como contadores tbm são bem comuns.
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while(i  <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while(i < 15);
		
		System.out.println(i);

	}

}

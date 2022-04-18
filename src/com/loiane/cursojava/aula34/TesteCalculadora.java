package com.loiane.cursojava.aula34;

public class TesteCalculadora {

	static int resultSoma;
	
	public static void main(String[] args) {
		
		// MinhaCalculadora calc = new MinhaCalculadora();
		
		// System.out.println(calc.soma(1,2));
		
		resultSoma = MinhaCalculadora.soma(1,2);
		
		int joaoVictor = soma2Valores(2, 7);
		System.out.println(joaoVictor);
		
	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}
}

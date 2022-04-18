package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("Entre com a idade: ");
		
		
		 int idade = scan.nextInt();
		 
		
		if(idade >= 18) {
			System.out.println("É maior de idade");
		} else {
			System.out.println("Não é maior de idade");
		}
		
		*/
		
		System.out.print("Entre com o preço do item: ");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Esta barato. Pode comprar.");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Você pode pedir um desconto.");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquise por um valor menor.");
		} else {
			System.out.println("Está muito caro.");
		}
		
		
		scan.close();
	}

}

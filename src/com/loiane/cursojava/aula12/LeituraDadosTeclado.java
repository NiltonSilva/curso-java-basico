package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("\n******************************\n");
		
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome); 
		
		System.out.println("\n******************************\n");
		
		System.out.print("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("\n******************************\n");
		
		System.out.print("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �: " + altura);
		
		System.out.println("\n******************************\n");
		*/
		
		// PARA LER TUDO EM UM COMANDO S�:
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estima��o: ");
		String primNome = scan.next();
		int idade2 = scan.nextInt();
		int qdadeFilhos = scan.nextInt();
		double alt = scan.nextDouble();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primNome);
		System.out.println("Idade: " + idade2);
		System.out.println("Quantidade de filhos: " + qdadeFilhos);
		System.out.println("Altura: " + alt);
		System.out.println("Tem bichinho de estima��o? " + temPet);
		
		scan.close();

	}

}

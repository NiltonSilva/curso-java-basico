package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("\n******************************\n");
		
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome); 
		
		System.out.println("\n******************************\n");
		
		System.out.print("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("\n******************************\n");
		
		System.out.print("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		System.out.println("\n******************************\n");
		*/
		
		// PARA LER TUDO EM UM COMANDO SÓ:
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
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
		System.out.println("Tem bichinho de estimação? " + temPet);
		
		scan.close();

	}

}

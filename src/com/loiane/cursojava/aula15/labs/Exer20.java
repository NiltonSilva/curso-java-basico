package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Aula 15 - Questão 20");
		
		int qdadeRespPositivas = 0;
		
		System.out.print("Telefonou para a vítima (S/N)? ");
		char telefonema = input.next().charAt(0);
		if(telefonema == 's' || telefonema == 'S') {
			qdadeRespPositivas++;
		}
		
		System.out.print("Esteve no local do crime (S/N)? ");
		char localCrime = input.next().charAt(0);
		if(localCrime == 's' || localCrime == 'S') {
			qdadeRespPositivas++;
		}
		
		System.out.print("Mora próximo da vítima (S/N)? ");
		char moraProximo = input.next().charAt(0);
		if(moraProximo == 's' || moraProximo == 'S') {
			qdadeRespPositivas++;
		}
		
		System.out.print("Devia R$ para a vítima (S/N)? ");
		char devia = input.next().charAt(0);
		if(devia == 's' || devia == 'S') {
			qdadeRespPositivas++;
		}
		
		System.out.print("Já trabalhou com a vítima (S/N)? ");
		char trabalhou = input.next().charAt(0);
		if(trabalhou == 's' || trabalhou == 'S') {
			qdadeRespPositivas++;
		}
		
		System.out.println();
		System.out.println("Respondeu positivo para " + qdadeRespPositivas + " respostas:");
		
		switch (qdadeRespPositivas) {
		case 0:
		case 1: 
			System.out.println("Inocente");
			break;
		case 2:
			System.out.println("Suspeita");
			break;
		case 3:
		case 4: 
			System.out.println("Cúmplice");
			break;
		case 5:
			System.out.println("Assassino(a)");
			break;
		}
		
		input.close();
	}

}

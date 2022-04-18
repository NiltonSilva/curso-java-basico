package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda: ");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Entre com as informações do contato " + (i+1));
			Contato c = new Contato();
			
			System.out.print("Entre com o nome: ");
			nome = scan.nextLine();
			c.setNome(nome);
			System.out.print("Entre com o teefone: ");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			System.out.print("Entre com o e-mail: ");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
		if(agenda != null ) {
			System.out.println(agenda.obterInfo());
		}
		
		
		scan.close();
	*/
		
		int num = 0;
		int i = 3;
		int a = i + i * 5;
		num = a;
		num = num + 1;
		System.out.println(num);
	}
	
	

}

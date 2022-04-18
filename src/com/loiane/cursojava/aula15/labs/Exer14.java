package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Informe a primeira nota: ");
    double nota1 = scan.nextDouble();
    System.out.print("Informe a segunda nota: ");
    double nota2 = scan.nextDouble();
    
    double media = (nota1 + nota2) / 2;
    String conceito = "a";
    
    if(media < 4) {
    	conceito = "E";
    } else if(media >= 4 && media < 6) {
    	conceito = "D";
    } else if(media >= 6 && media < 7.5) {
    	conceito = "C";
    } else if(media >= 7.5 && media < 9) {
    	conceito = "B";
    } else if(media >= 9 && media < 10) {
    	conceito = "A";
    } else {
    	System.out.println("Média inválida. Por favor, verifique os valores inseridos.");
    }
    
    System.out.println("PRIMEIRA NOTA: " + nota1);
    System.out.println("SEGUNDA NOTA: " + nota2);
    System.out.println("MEDIA: " + media);
    System.out.println("CONCEITO: " + conceito);
    switch(conceito) {
    	case "A":
    	case "B":
    	case "C":
    		System.out.println("APROVADO");
    		break;
    	case "D":
    	case "E":
    		System.out.println("REPROVADO");
    }
    
    scan.close();
    }
}

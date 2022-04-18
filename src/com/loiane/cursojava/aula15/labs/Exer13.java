package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.print("Informe um n�mero de 1 a 7 (de Domingo a S�bado): ");
	    int dia = scan.nextInt();
	    
	    switch(dia) {
	    	case 1:
	    		System.out.println("Domingo");
	    		break;
	    	case 2:
	    		System.out.println("Segunda-Feira");
	    		break;
	    	case 3:
	    		System.out.println("Ter�a-Feira");
	    		break;
	    	case 4:
	    		System.out.println("Quarta-Feira");
	    		break;
	    	case 5: 
	    		System.out.println("Quinta-Feira");
	    		break;
	    	case 6:
	    		System.out.println("Sexta-Feira");
	    		break;
	    	case 7:
	    		System.out.println("S�bado");
	    		break;
	    	default:
	    		System.out.println("Valor inv�lido");
	    }
	    
	    scan.close();
    }
}

package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro lado: ");
		double ladoA = scan.nextDouble();
		System.out.print("Informe o segundo lado: ");
		double ladoB = scan.nextDouble();
		System.out.print("Informe o terceiro lado: ");
		double ladoC = scan.nextDouble();
		
		if(((ladoA + ladoB) > ladoC) || ((ladoA + ladoC) > ladoB) || ((ladoB + ladoC > ladoA))) {
			if(ladoA == ladoB && ladoB == ladoC) {
				System.out.println("Tri�ngulo equil�tero");
			} else if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
				System.out.println("Tri�ngulo escaleno");
			} else {
				System.out.println("Tri�ngulo is�sceles");
			}
		} else {
			System.out.println("As medidas informadas n�o formam tri�ngulo.");
		}
		
		scan.close();

	}

}

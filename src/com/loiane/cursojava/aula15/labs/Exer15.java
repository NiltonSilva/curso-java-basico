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
				System.out.println("Triângulo equilátero");
			} else if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
				System.out.println("Triângulo escaleno");
			} else {
				System.out.println("Triângulo isósceles");
			}
		} else {
			System.out.println("As medidas informadas não formam triângulo.");
		}
		
		scan.close();

	}

}

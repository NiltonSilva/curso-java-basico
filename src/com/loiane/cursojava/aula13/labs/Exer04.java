/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author nsfma
 */
public class Exer04 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4, media;
        
        System.out.println("Informe a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.println("Informe a terceira nota: ");
        nota3 = scan.nextDouble();
        System.out.println("Informe a quarta nota: ");
        nota4 = scan.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A média é " + media);
        
        scan.close();
        
    }
    
}
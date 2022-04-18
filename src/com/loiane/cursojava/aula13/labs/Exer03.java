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
public class Exer03 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        double primeiroNumero = scan.nextDouble();
        System.out.print("Informe o segundo número: ");
        double segundoNumero = scan.nextDouble();
        
        System.out.println("O resultado da soma é " + (primeiroNumero+segundoNumero));
        
        scan.close();
    }
    
}
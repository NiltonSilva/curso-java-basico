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
public class Exer02 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numeroInformado = scan.nextDouble();
        
        System.out.println("O número informado foi " + numeroInformado);
        
        scan.close();
    }
    
}
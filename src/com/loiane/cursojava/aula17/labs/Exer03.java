package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        
        boolean infoValida = false;
        
        do {
            System.out.print("Informe o nome: ");
            nome = scan.next();
            if(nome.length() > 3){
                infoValida = true;
            } else {
                System.out.println("O nome deve ter mais que 3 caracteres. Por favor, tenta novamente!");
            }
        } while(!infoValida);
        
        infoValida = false;
        
        do {
            System.out.print("Informe a idade: ");
            idade = scan.nextInt();
            if(idade >= 0 && idade <= 150){
                infoValida = true;
            } else {
                System.out.println("A idade deve ter entre 0 e 150. Por favor, tenta novamente!");
            }
        } while(!infoValida);
        
        infoValida = false;
        
        do {
            System.out.print("Informe o salário: ");
            salario = scan.nextDouble();
            if(salario > 0){
                infoValida = true;
            } else {
                System.out.println("O salário deve ser maior que 0. Por favor, tenta novamente!");
            }
        } while(!infoValida);
        
        infoValida = false;
        
        do {
            System.out.print("Informe o sexo: ");
            sexo = scan.next();
            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("O sexo deve ser 'F' ou 'M'. Por favor, tenta novamente!");
            }
        } while(!infoValida);
        
        infoValida = false;
        
        do {
            System.out.print("Informe o estado civil: ");
            estadoCivil = scan.next();
            if(estadoCivil.equals("c") || estadoCivil.equals("s") || estadoCivil.equals("v") || estadoCivil.equals("d")){
                infoValida = true;
            } else {
                System.out.println("O estado civil deve ser 'S', 'C', 'D' ou 'V'. Por favor, tenta novamente!");
            }
        } while(!infoValida);
        
        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
        
        scan.close();
    }
}

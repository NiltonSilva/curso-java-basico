package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        boolean infoValidas = false;
        String nameUser;
        String senha;
        
        do {
            System.out.print("Informe o nome de usu�rio: ");
            nameUser = scan.next();
            
            System.out.print("Entre com a senha: ");
            senha = scan.next();
            
            if(nameUser.equalsIgnoreCase(senha)){
                infoValidas = false;
                System.out.println("Senha igual ao usu�rio. Digite novamente!");
            } else {
                infoValidas = true;
                System.out.println("Senha e usu�rio v�lidos");
            }
        } while(!infoValidas);
        
        scan.close();
    }
}

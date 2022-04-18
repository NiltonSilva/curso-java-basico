
package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.print("Digite uma letra: ");
            String letra = scan.next();
            
            /*
            
            1º OPÇÃO: 
            if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
                System.out.println("A letra informada é VOGAL.");
            } else {
                System.out.println("A letra informada é CONSOANTE.");
            }
            */
            
            if(letra.length() > 1){
                System.out.println("Não é uma letra válida.");
            } else {
               // 2º OPÇÃO:
                switch(letra){
                case "a":
                case "A":
                case "e":
                case "E":
                case "i":
                case "I":
                case "o":
                case "O":
                case "u":
                case "U":
                    System.out.println("VOGAL");
                    break;
                default:
                    System.out.println("CONSOANTE");
                } 
            }
        scan.close();
    }
}

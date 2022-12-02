/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cassioa trindade
  
    Defina um método main em Java que lê Strings do teclado até que seja lida 
    uma String igual a uma das quinze últimas digitadas. Quando isto ocorre, 
    o programa imprime o número de Strings lidas, o tamanho da maior String lida, 
    e a concatenação de todas as Strings lidas exceto a última. Use um array 
    para armazenar as quinze últimas Strings lidas. Use também métodos 
    auxiliares para facilitar o entendimento do código.
        
 */
public class ExercicioDoze {
    private static List palavras = new ArrayList<String>();
    
    public static void main(String[] args) {
        
        lerStings();
        resultado();
    }

    private static void lerStings() {
        Scanner ler = new Scanner(System.in);
        String palavra, palavaraAnterior = null;
      
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nDigite a palavra numero " + ((int)i+1) + ": ");
            palavra = ler.next();
            palavras.add(palavra);
            if(i != 0)
              if(testaPalavra(palavra)) return;
        }
        
    }

    private static String todasPalavras() {
        String todas = "| ";
        for (int i = 0; i < palavras.size(); i++) {
            todas = todas + palavras.get(i) + " | ";
        }
        return todas;
    }

    private static void resultado() {
         System.out.println(todasPalavras());
         System.out.println("Numero de Strings lidas: " + palavras.size());
         System.out.println("Maior String: " + maiorString());
         
    }

    private static boolean testaPalavra(String palavra) {
        for (int i = 0; i < palavras.size()-1; i++) {
            if(palavras.get(i).equals(palavra) ) {
                return true;
            }
        }  
         return false;
         
    }

    private static int maiorString() {
        int maiorString = 0;
        for (int i = 0; i < palavras.size(); i++) {
            if(maiorString < palavras.get(i).toString().length()){
                maiorString = palavras.get(i).toString().length();
             }
        }
        return maiorString;
     }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.senac.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cassioatrindade
 */
public class ExerciciosArrays {

    public static void main(String[] args) {

        List arrayNumeros = new ArrayList(Arrays.asList(2, -1, -3, -9, 10, -7, 3, 4, 2, -3));
        List arrayNumerosPositivos = new ArrayList(Arrays.asList(2, 10, 17, 32, 41, 201));

        //exercicioUm();
        //exercicioDois();
        //exercioTres();
        //exercicioQuatro(arrayNegativo);
        //exercicioCinco(arrayNumeros, -3);
        //exercicioSeis(arrayNumeros);
        //exercicioSete(arrayNumeros);
        //exercicioOito();
        //exercicioNove(arrayNumerosPositivos);
        //exercicioDezA(arrayNumeros);
        //exercicioDezB(arrayNumeros, arrayNumerosPositivos);
        exercicioOnze();
        
    }

    private static void exercicioUm() {
        /*
        Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que preencha um array com os valores: 
        10 9 8 7 6 5 4 3 2 1
        0 1 4 9 16 25 36 49 64 81 100 
        1 2 3 4 5 10 20 30 40 50 
        3 4 7 12 19 28 39 52 67 84

         */
        // A
        List arrayA = new ArrayList();
        for (int i = 10; i > 0; i--) {
            arrayA.add(i);
        }
        System.out.println("Array A");
        System.out.println(arrayA);

        // B
        System.out.println("\n Array B");
        int[] arrayB = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + ",");
        }

        // C
        System.out.println("\n\n Array C");
        int[] arrayC = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50,};
        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i] + ",");
        }

        // D
        System.out.println("\n\n Array D");
        List arrayD = new ArrayList(Arrays.asList(3, 4, 7, 12, 19, 28, 39, 52, 67, 84));
        for (Object numero : arrayD) {
            System.out.print(numero + ",");
        }
    }

    private static void exercicioDois() {
        /*
        Escreva um trecho Java que exiba os valores de um array a double numa mesma linha. 
         */

        Double arrayDouble[] = new Double[20];
        for (int i = 0; i < 20; i++) {
            arrayDouble[i] = Math.random() * 100;
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(i + "-");
            System.out.println(arrayDouble[i] + ",");
        }
    }

    private static void exercioTres() {
        /*
        Escreva um trecho Java que leia 10 valores double do teclado e armazene-os num array d.
         */
        Scanner sc = new Scanner(System.in);

        Double arrayDouble[] = new Double[9];

        for (int j = 0; j < arrayDouble.length; j++) {
            String i = sc.next();
            arrayDouble[j] = Double.parseDouble(i);
        }
        for (Double arrayDouble1 : arrayDouble) {
            System.out.print(arrayDouble1 + "-");
        }
    }

    /**
     * @return retorna a quantidade de elementos do array que são números
     * negativos
     * @param arrayNegativo
     */
    private static Integer exercicioQuatro(List arrayNegativo) {
        /*
        Crie um método que recebe um array de inteiros e retorna a quantidade de elementos do array que são números negativos. 
         */
        int quantidadeNumerosNegativos = 0;

        for (int i = 0; i < arrayNegativo.size(); i++) {
            if ((Integer) arrayNegativo.get(i) < 0) {
                quantidadeNumerosNegativos++;
            }
        }
        System.out.println(quantidadeNumerosNegativos);
        return quantidadeNumerosNegativos;

    }

    private static Integer exercicioCinco(List arrayNumeros, Integer numero) {
        /*
        Crie um método que recebe um array de inteiros a e um valor inteiro x 
        e retorna a quantidade de vezes que x aparece no array a.
         */

        int quantidadeNumeroRepetido = 0;

        for (int i = 0; i < arrayNumeros.size(); i++) {
            if ((Integer) arrayNumeros.get(i) == numero) {
                quantidadeNumeroRepetido++;
            }
        }
        System.out.println(quantidadeNumeroRepetido);
        return quantidadeNumeroRepetido;
    }

    private static List exercicioSeis(List arrayNumeros) {
        List arrayBoolean = new ArrayList<Boolean>();

        for (int i = 0; i < arrayNumeros.size(); i++) {
            if ((Integer) arrayNumeros.get(i) > 0) {
                arrayBoolean.add(true);
            } else {
                arrayBoolean.add(false);
            }
        }
        System.out.println(arrayBoolean);
        return arrayBoolean;
    }

    private static void exercicioSete(List arrayNumeros) {
        /*
        Escreva um método que recebe um array de números e devolve a posição onde 
        se encontra o maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira ocorrência.
         */
        int posicao = 0, valor = 0;

        for (int i = 0; i < arrayNumeros.size(); i++) {
            if ((Integer) arrayNumeros.get(i) > valor) {
                posicao = i;
                valor = (Integer) arrayNumeros.get(i);
            }
        }
        System.out.println("Posição = " + posicao + " Valor = " + valor);
    }

    private static void exercicioOito() {
        // Faça um método que devolve um array de números lidos do teclado
        Scanner ler = new Scanner(System.in);
        List numeros = new ArrayList();
        int n, valor;
        System.out.printf("Informe um número de elementos do array: ");
        n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nDigite numero da possição " + i + ": ");
            valor = ler.nextInt();
            numeros.add(valor);
        }

        System.out.println("Array: " + numeros);
    }

    private static void exercicioNove(List arrayNumeros) {
        /* Crie um método que recebe um array de inteiros positivos e substitui
        seus elementos de valor ímpar por -1 e os pares por +1
         */
        for (int i = 0; i < arrayNumeros.size(); i++) {
            if ((int) arrayNumeros.get(i) % 2 == 0) {
                arrayNumeros.set(i, +1);
            } else {
                arrayNumeros.set(i, -1);
            }

        }
        System.out.println(arrayNumeros);
    }

    private static void exercicioDezA(List arrayNumeros) {
        /*
        * totalPares: a função recebe como parâmetro um array de inteiros e retorna um número inteiro indicando 
        o total de números pares existentes no array.  
        * maiorValor: a função recebe como parâmetro um array de inteiros e retorna o  maior número existente no array.  
         
         */
        int totalPar = 0, maiorValor = 0;
        for (int i = 0; i < arrayNumeros.size(); i++) {
            if ((int) arrayNumeros.get(i) % 2 == 0) {
                totalPar++;
            }
            if ((int) arrayNumeros.get(i) > maiorValor) {
                maiorValor = (int) arrayNumeros.get(i);
            }

        }
        System.out.println(" Total pares: " + totalPar + " | Maior valor: " + maiorValor);

    }

    private static void exercicioDezB(List arrayNumeros, List arrayNumerosPositivos) {
        /* valoresIguais: a função recebe como parâmetro dois arrays de inteiros e retorna o 
        total de números iguais existentes em ambos os arrays.   
         */
        List arrayNumerosIguais = new ArrayList();
        for (int i = 0; i < arrayNumerosPositivos.size(); i++) {
            for (int j = 0; j < arrayNumeros.size(); j++) {
                if (arrayNumerosPositivos.get(i) == arrayNumeros.get(j)) {
                    arrayNumerosIguais.add(arrayNumeros.get(j));
                }
            }
        }
        System.out.println("Array numeros iguais: " + arrayNumerosIguais);
        System.out.println("total numeors iguais: " + arrayNumerosIguais.size());
    }

    private static void exercicioOnze() {
        /*
        Defina um método main em Java que lê Strings do teclado até que sejam lidas 
        duas Strings iguais em seqüência, uma imediatamente após a outra. Quando 
        isto ocorre, o programa imprime o número de Strings lidas, o tamanho da 
        maior String lida, e a concatenação de todas as Strings lidas exceto a última.
        Lembre-se que o operador '==' não compara o conteúdo das Strings. Olhe a 
        documentação da classe String da API de Java para verificar que métodos 
        você pode reusar para implementar os serviços solicitados.
         */
        Scanner ler = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite a primeira String:");
            String primeira = ler.next();
            System.out.println("Digite a segunda String:");
            String segunda = ler.next();
            if (primeira.equals(segunda)) {
                System.out.println("****** Strings iguai! Obrigado ******");
                continuar = false;
            }
            System.err.println("Tente outra vez !!!!");

        }
    }

   
}
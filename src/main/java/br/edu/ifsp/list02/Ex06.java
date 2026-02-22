package br.edu.ifsp.list02;

import java.util.Scanner;
import java.util.StringJoiner;

/*
    Faça um programa que leia um valor inteiro N. Após isso, leia dois vetores A e B de tamanho N. Em seguida, o programa
    deve criar um vetor C com os elementos de A e B intercalados.

    Exemplos de entrada e saída:

    | Entrada                 | Saída                         |
    | -------                 | ------                        |
    | 6                       | 5 10 6 20 3 30 8 40 2 50 0 60 |
    | 5 6 3 8 2 0             |                               |
    | 10 20 30 40 50 60       |                               |
      ---
    | 3                       | 1 1 2 1 3 1                   |
    | 1 2 3                   |                               |
    | 1 1 1                   |                               |

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex06 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int[] arrayA = new int[N];
        final int[] arrayB = new int[N];

        for (int i = 0; i < arrayA.length; i++)
            arrayA[i] = scanner.nextInt();

        for (int i = 0; i < arrayB.length; i++)
            arrayB[i] = scanner.nextInt();

        final Ex06 ex06 = new Ex06();//
        System.out.println(ex06.compute(arrayA, arrayB));
        scanner.close();
    }

    String compute(int[] arrayA, int[] arrayB) {
        final var joiner = new StringJoiner(" ");
        for(int i = 0; i<arrayA.length;i++){
            joiner.add(String.valueOf(arrayA[i]));
            joiner.add(String.valueOf(arrayB[i]));
        }

        return joiner.toString();
    }
}

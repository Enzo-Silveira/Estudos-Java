package br.edu.ifsp.list02;

import java.util.Scanner;

/*
    Você está responsável pelo bolo de aniversário da sua priminha e decidiu que o bolo terá uma vela para cada ano da
    idade total dela. Quando ela assopra as velas, ela só é capaz de apagar apenas as velas mais altas. Sua tarefa é fazer
    um programa que leia a idade A da sua sobrinha e a altura das velas. Após isso, seu programa deve imprimir a
    quantidade de velas que ela vai conseguir apagar.

    Por exemplo, se sua sobrina está fazendo 4 anos e o bolo possui 4 velas de tamanhos 4, 4, 1, 3, então ela só vai
    conseguir apagar as duas mais altas, de tamanho 4. Portanto, a resposta deve ser 2.

    ### Exemplos de entrada e saída:

    | Entrada               | Saída  |
    | -------               | ------ |
    | 4    4    4    1    3 | 2      |
    | 4    3    2    1    3 | 2      |

    Fonte: Adaptado de https://www.hackerrank.com/challenges/birthday-cake-candles/problem
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex05 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int age = scanner.nextInt();
        final int[] velas = new int[age];
        for (int i = 0; i < velas.length; i++) {
            velas[i] = scanner.nextInt();
        }
        final Ex05 ex05 = new Ex05();
        System.out.println(ex05.compute(velas));
        scanner.close();
    }

    int compute(int[] velas) {
        int biggest = 0;
        int number = 0;
        for(int value : velas){
            if(value>biggest){
                biggest = value;
            }
        }
        for(int value : velas){
            if(value == biggest){
                number++;
            }
        }
        return number;
    }
}

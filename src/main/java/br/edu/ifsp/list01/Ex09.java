package br.edu.ifsp.list01;

import java.util.Locale;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/
public class Ex09 {

    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        List<Integer> input = new ArrayList<>();
//        final Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        while(age>=0){
//            input.add(age);
//            age = scanner.nextInt();
//        }
//        final Ex09 ex09 = new Ex09();
//        System.out.println(ex09.compute(input));
//        scanner.close();
    }

    String compute(int[] input) { // List<Integer>
        Locale.setDefault(Locale.US);
        double average = 0, percentage;
        int adult = 0, old = 0, i;//i=0;
        for(i=0;i<input.length && input[i]>=0;i++){//input.size() e era um while
            average += input[i];//input.get(i)
            if(input[i]>75){//input.get(i)
                old++;
            }
            if (input[i]>=18) {//input.get(i)
                adult++;
            }
            //i++;
        }

        average = average/i;
        percentage = (double) (old * 100) /i;

        return String.format("%.2f %d %.2f%%",average,adult,percentage);
    }
}

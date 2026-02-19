package br.edu.ifsp.list01;

/*
    Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que verifica se o triângulo é:

    Escaleno (todos os lados diferentes)
    Isósceles (possui dois lados iguais)
    Equilátero (todos os lados iguais)
    Não forma triângulo (a soma de dois lados deve ser maior que o terceiro lado)
    Os três números devem ser inteiros positivos e lidos na mesma linha (Ex: 3 4 5) Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 3 2 | Saída = Isosceles
    Exemplo 2: Entrada = 2 2 2 | Saída = Equilatero
    Exemplo 3: Entrada = 1 2 4 | Saída = Nao forma triangulo
    Exemplo 4: Entrada = -1 2 4 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final Ex02 ex02 = new Ex02();
        System.out.println(ex02.compute(a, b, c));
        scanner.close();
    }

    String compute(int a, int b, int c) {
        if(a>0 && b>0 && c>0){
            if(a<b+c && b<a+c && c<a+b){
                if(a==b && b==c){
                    return "Equilatero";
                }else if(a==b || b==c || a==c){
                    return "Isosceles";
                }
            }else{
                return "Nao forma triangulo";
            }
            return "Escaleno";
        }
        return "Erro";
    }
}

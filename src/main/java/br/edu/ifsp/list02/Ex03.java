package br.edu.ifsp.list02;

/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
public class Ex03 {
    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    String compute(int[] firstFive, int[] otherInts) {
        String output = "";
        int[] fullArray = new int[10];
        int i, qt = 0;
        boolean flag = false;
        for(i = 0; i < firstFive.length; i++){
            fullArray[i] = firstFive[i];
            qt++;
        }

        for(int value : otherInts){
            for(i = 0;i<qt;i++){
                if(fullArray[i]==value){
                    flag = true;
                    while (i<qt){
                        fullArray[i] = fullArray[i+1];
                        i++;
                    }
                    qt--;
                }
            }
            if(!flag){
                fullArray[qt] = value;
                qt++;
                if(qt == 10){
                    //for(i = 0;i<qt;i++){}
                    //output = fullArray.toString();
                    return output;
                }else{
                    //output = fullArray.toString();
                    System.out.println(output);
                }

            }else{
                if(qt == 0){
                    return null;
                }else{
                    //output = fullArray.toString();
                    System.out.println(output);
                    flag = false;
                }
            }
        }
        return null;
    }
}

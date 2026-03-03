package maratona;

import java.util.Scanner;

public class Bolsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int C = scanner.nextInt();

        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        int lucro = 0;
        int min = P[0];

        for (int i = 1; i < N; i++) {
            if (P[i] < min) {
                min = P[i];
            }
            else if (P[i] > min + C) {
                lucro += P[i] - min - C;
                min = P[i] - C;
            }
        }

        System.out.println(lucro);
    }
}

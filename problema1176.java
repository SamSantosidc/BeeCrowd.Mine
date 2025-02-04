package beeCrowd;

import java.util.Scanner;

public class problema1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CODIGO DE SAMUEL PORRA
        int T = sc.nextInt();

        final int TAMANHO_VETOR = 61;
         long[] vetorFibonacci = new long[TAMANHO_VETOR];

         //Uma forma bem melhor de povoar o Fibonacci
        vetorFibonacci[0] = 0;
        vetorFibonacci[1] = 1;

        for (int i = 2; i < TAMANHO_VETOR; i++) {
            vetorFibonacci[i] = vetorFibonacci[i - 1] + vetorFibonacci[i - 2];
        }

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println("Fib(" + N + ") = " + vetorFibonacci[N]);
            }

        sc.close();
    }
}


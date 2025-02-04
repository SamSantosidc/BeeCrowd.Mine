package beeCrowd;

import java.util.Scanner;

public class problema1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (0 > N || N > 46) {
            System.out.println("Número inválido, digite novamente: ");
            N = sc.nextInt();
        }

        int primeiroNumero = 0;
        int segundoNumero = 1;
        int proximoNumero = 0;

        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                // Último número imprime sem espaço
                System.out.println(primeiroNumero);
            } else {
                // Outros números imprime com espaço
                System.out.print(primeiroNumero + " ");
            }
            proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;

        }
        sc.close();

    }
}

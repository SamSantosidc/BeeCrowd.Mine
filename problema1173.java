package beeCrowd;

import java.util.Scanner;

public class problema1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();

        while (0 > V || V > 50){
            V = sc.nextInt();
        }

        //Definir vetor
        final int TAMANHO_VETOR = 10;
        int[] vetor = new int[TAMANHO_VETOR];

        //Povoar vetor
        vetor[0] = V;
        for (int i = 1; i < TAMANHO_VETOR; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }

        //Exibir vetor
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }

    }
}

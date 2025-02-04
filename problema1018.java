package beeCrowd;

import java.util.Scanner;

public class problema1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NOTA_100 = 100;
        final int NOTA_50 = 50;
        final int NOTA_20 = 20;
        final int NOTA_10 = 10;
        final int NOTA_5 = 5;
        final int NOTA_2 = 2;
        final int NOTA_1 = 1;

        int N = sc.nextInt();
        int valorRestante = N;

        int quantNota100 = valorRestante / NOTA_100;
        valorRestante %= NOTA_100;

        int quantNota50 = valorRestante / NOTA_50;
        valorRestante %= NOTA_50;

        int quantNota20 = valorRestante / NOTA_20;
        valorRestante %= NOTA_20;

        int quantNota10 = valorRestante / NOTA_10;
        valorRestante %= NOTA_10;

        int quantNota5 = valorRestante / NOTA_5;
        valorRestante %= NOTA_5;

        int quantNota2 = valorRestante / NOTA_2;
        valorRestante %= NOTA_2;

        int quantNota1 = valorRestante / NOTA_1;

        System.out.println(N);
        System.out.println(quantNota100 + " nota(s) de R$ 100,00");
        System.out.println(quantNota50 + " nota(s) de R$ 50,00");
        System.out.println(quantNota20 + " nota(s) de R$ 20,00");
        System.out.println(quantNota10 + " nota(s) de R$ 10,00");
        System.out.println(quantNota5 + " nota(s) de R$ 5,00");
        System.out.println(quantNota2 + " nota(s) de R$ 2,00");
        System.out.println(quantNota1 + " nota(s) de R$ 1,00");
    }
}
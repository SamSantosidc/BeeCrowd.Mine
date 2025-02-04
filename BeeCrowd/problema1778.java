package beeCrowd;

import java.util.Scanner;

public class problema1778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] N = new double[100];

        double X = sc.nextDouble();

        for (int i = 0; i < N.length; i++) {
            if (i == 0) {
                N[i] = X;
            }
            else {
                N[i] = N[i - 1] / 2;
            }
        }

        for (int i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, N[i]);
        }
    }
}

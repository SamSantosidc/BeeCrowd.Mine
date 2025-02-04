package beeCrowd;

import java.util.Scanner;

public class problema1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[1000];

        int T = sc.nextInt();

        for (int i = 0; i < N.length; i++) {
            N[i] = i % T;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i] );
        }
    }
}

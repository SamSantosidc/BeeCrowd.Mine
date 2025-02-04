package beeCrowd;

import java.util.Scanner;

public class problema1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroIdentificacao = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double salarioPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * salarioPorHora;
        System.out.println("NUMBER = " + numeroIdentificacao);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}

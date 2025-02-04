package beeCrowd;

import java.util.Scanner;

public class problema1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double reajuste0400 = 0.15;
        double reajuste400800 = 0.12;
        double reajuste8001200 = 0.1;
        double reajuste12002000 = 0.07;
        double reajuste2000mais = 0.04;

        double salario = sc.nextDouble();

        while (salario < 0) {
            System.out.println("Valor inválido, tente novemante:");
            salario = sc.nextDouble();
        }

        reajusteSalarial result = getReajusteSalarial(salario, reajuste0400, reajuste400800, reajuste8001200, reajuste12002000, reajuste2000mais);

        System.out.printf("Novo salario: %.2f%n", result.novoSalario());
        System.out.printf("Reajuste ganho: %.2f%n", result.reajusteGanho());
        System.out.println("Em percentual: " + result.emPercentual() + " %");

    }

    private static reajusteSalarial getReajusteSalarial(double salario, double reajuste0400, double reajuste400800, double reajuste8001200, double reajuste12002000, double reajuste2000mais) {
        double novoSalario = 0;
        double reajusteGanho = 0;
        int emPercentual = 0;

        if (salario > 0 && salario <= 400){
            novoSalario = salario + (salario * reajuste0400);
            reajusteGanho = novoSalario - salario;
            emPercentual = 15;
        } else if (salario > 400 && salario <=800) {
            novoSalario = salario + (salario * reajuste400800);
            reajusteGanho = novoSalario - salario;
            emPercentual = 12;
        } else if (salario > 800 && salario <=1200) {
            novoSalario = salario + (salario * reajuste8001200);
            reajusteGanho = novoSalario - salario;
            emPercentual = 10;
        } else if (salario > 1200 && salario <=2000) {
            novoSalario = salario + (salario * reajuste12002000);
            reajusteGanho = novoSalario - salario;
            emPercentual = 7;
        } else {
            novoSalario = salario + (salario * reajuste2000mais);
            reajusteGanho = novoSalario - salario;
            emPercentual = 4;
        }
        return new reajusteSalarial(novoSalario, reajusteGanho, emPercentual);
    }

    private record reajusteSalarial(double novoSalario, double reajusteGanho, int emPercentual) {
    }
}

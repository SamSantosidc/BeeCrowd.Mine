package beeCrowd;

import java.util.Scanner;

public class problema1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double notaC = sc.nextDouble();

        if (notaA < 0 || notaA > 10){
            System.exit(1);
        }
        if (notaB < 0 || notaB > 10){
            System.exit(1);
        }
        if (notaC < 0 || notaC > 10){
            System.exit(1);
        }

        int pesoA = 2;
        int pesoB = 3;
        int pesoC = 5;

        double mediaPonderada = ((notaA * pesoA) + (notaB * pesoB) + (notaC *pesoC)) / (pesoA + pesoB + pesoC);
        System.out.printf("MEDIA = %.1f%n",mediaPonderada );
    }
}

//DUVIDA: NÃO SOUBE COMO CRIAR UM CHECK MELHOR PARA AS NOTAS, DEBATER IDEIAS NA AULA
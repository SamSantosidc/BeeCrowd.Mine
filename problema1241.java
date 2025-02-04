package beeCrowd;

import java.util.Scanner;

public class problema1241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Recebe numero de casos
        System.out.println("Digite quantos testes: ");
        int N = sc.nextInt();
        sc.nextLine();

        String[] testes = new String[N];
        for (int i = 0; i < N ; i++) {
            testes[i] = sc.nextLine();
        }

        for (int i = 0; i < N ; i++) {
            String [] numeros = testes[i].split("\\s+");

            //Testar se possui apenas digitos
            if (numeros.length != 2|| !numeros[0].matches("[0-9]+") || !numeros[1].matches("[0-9]+")) {
                break;
            }
            //Ver se encaixa ou não
            if(numeros[0].endsWith(numeros[1])){
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }


        }
        sc.close();
    }

}

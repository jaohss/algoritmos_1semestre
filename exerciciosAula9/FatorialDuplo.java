import java.util.Scanner;

public class FatorialDuplo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;

        System.out.print("Digite um número inteiro positivo: ");
        n = scn.nextInt();

        if (n <= 0) {
            System.out.println("Erro: O número deve ser positivo.");
            return;
        }

        if (n == 1) {
            System.out.println("Fatorial duplo de 1: 1");
            return;
        }

        long fator = 1;
        for (int i = 2; i <= n; i += 2) {
            long produto = 1;
            for (int j = 2; j <= i; j += 2) {
                produto =produto * j;
            }
            fator = produto;
        }

        System.out.println("Fatorial duplo de " + n + ": " + fator);

        scn.close();
    }
}
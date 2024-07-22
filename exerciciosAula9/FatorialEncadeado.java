import java.util.Scanner;

public class FatorialEncadeado {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fator=1;

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scn.nextInt();

        if (numero < 0) {
            System.out.println("Erro: O número deve ser não negativo.");
            return;
        }

        for (int i = 1; i <= numero; i++) {
            int produto=1;

            for (int j = 1; j <= i; j++) {
                produto *= j;
            }
            fator=produto;
        }

        System.out.println("Fatorial de " + numero + ": " + fator);

        scn.close();
    }
}
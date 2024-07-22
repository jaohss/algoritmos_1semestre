import java.util.Scanner;
public class Media{
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner scanner =  new Scanner(System.in);
        double valor1, valor2, valor3, media, soma = 0.0;
        int qtdItens=3;

        //Entrada de dados
        System.out.println("Insira o valor do primeiro numero: ");
        valor1 = scanner.nextDouble();

        System.out.println("Insira o valor do segundo numero: ");
        valor2 = scanner.nextDouble();

        System.out.println("Insira o valor do terceiro numero: ");
        valor3 = scanner.nextDouble();

        //Processamento e saída de dados
        soma=(valor1 + valor2 + valor3);
        media= soma/qtdItens;

        System.out.println("Media= "+media);

        scanner.close();

        





    }
}
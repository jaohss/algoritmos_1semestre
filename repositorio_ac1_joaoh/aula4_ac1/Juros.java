import java.util.Scanner;
public class Juros{
    public static void main(String[] args) {
        //Exercício:Juros simples
        //Declaração de variáveis
        double juros=0;
        int tempo=0;
        double capital=0;
        double taxa_juros=0;
        double montante=0;


        Scanner scanner = new Scanner(System.in);

        //Entrada de dados

        System.out.println("Digite o valor do capital em R$: ");
        capital = scanner.nextDouble();

        System.out.println("Digite o valor para taxa de juros em valor decimal: ");
        taxa_juros = scanner.nextDouble();

        System.out.println("Digite o valor desejado do tempo para o calculo do juros(em meses): ");
        tempo = scanner.nextInt();


        //Processamento e saída de dados    
        juros = capital*taxa_juros*tempo;
        montante=juros+capital;

        System.out.println("O juro recebido depois de "+tempo+ " equivale a R$" +juros);
        System.out.println("O valor do montante final equivale a: " +montante);

        scanner.close();






    }
}
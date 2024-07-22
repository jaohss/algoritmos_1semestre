import java.util.Scanner;
public class Retangulo{
    public static void main(String[] args) {
        //Declaração de variáveis
        double base=0;
        double altura=0;
        double perimetro=0;

        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o valor da base do retangulo: ");
        base = scanner.nextDouble();

        System.out.println("Digite o valor da altura do retangulo: ");
        altura = scanner.nextDouble();

        //Processamento e saída de dados

        perimetro=2*(base+altura);

        System.out.println("O perimetro do trianglo equivale a: "+perimetro);

        scanner.close();




    }
}
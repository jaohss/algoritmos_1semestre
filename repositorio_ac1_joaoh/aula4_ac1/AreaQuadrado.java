import java.util.Scanner;

public class AreaQuadrado{
    public static void main(String[] args) {
        //Exercicio:Area do quadrado
        //Declaração de variáveis
        double lado=0.0;
        double area=0.0;
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digide o valor do lado do quadrado: ");
        lado = scanner.nextFloat();

        //Processamento e saída de dados
        area = Math.pow(lado,2.0); //expressão utilizada para calcular a potência de um numero, onde o variável lado será elevada ao quadrado

        System.out.println("A area do quadrado equivale a: "+area);

        scanner.close();

    }
}
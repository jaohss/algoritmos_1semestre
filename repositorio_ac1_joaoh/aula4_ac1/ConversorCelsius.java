import java.util.Scanner;
public class ConversorCelsius{
    public static void main(String[] args) {
        //Exercício: Conversão de celsius para fahrenheit
        //Declaração de variáveis
        double celsius=0;
        double fahrenheit=0;
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o valor da temperatura em celsius: ");
        celsius = scanner.nextDouble();

        //Processamento e saída de dados
        fahrenheit= celsius *1.8 +32; //Calculo utilizado para converter celsius em fahrenheit
        System.out.println("A temperatura em celsius "+celsius+ " em Fahrenheit equivale a: "+fahrenheit);
        scanner.close();
    }
}
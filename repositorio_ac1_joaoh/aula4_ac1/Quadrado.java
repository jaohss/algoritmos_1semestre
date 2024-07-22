import java.util.Scanner;
public class Quadrado{
    public static void main(String[] args) {
        //Exercício:Perimetro do quadrado
        //Declaração de variáveis
        float perimetro=0;
        float lado=0;
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o valor do lado do quadrado: ");
        lado = scanner.nextFloat();

        //Processamento e saída de dados
        perimetro=4*lado;
        System.out.println("O valor do perimetro do quadrado: "+perimetro);

        scanner.close();

    }
}
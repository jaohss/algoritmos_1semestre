import java.util.Scanner;

public class Raiz{
public static void main(String[] args) {
    //Exercicio:Raiz cúbica
    //Declaração de variáveis
    Scanner scanner = new Scanner(System.in);
    double raiz=0;
    int num=0;

    //Entrada de dados
    System.out.println("Digite um numero: ");
    num = scanner.nextInt();

    //Processamento e saída de dados
    raiz= Math.cbrt(num);//Expressão utilizada para o calculo da raiz cubica de um numero 
    System.out.println("A raiz cubica do numero "+num+ " equivale a: "+raiz);

    scanner.close();
    }
}
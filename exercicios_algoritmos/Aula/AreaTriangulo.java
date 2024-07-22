package Aula;
import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        double base=0;
        double altura=0;
        double area=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insita o valor da base do triângulo: ");
        base = scanner.nextDouble();

        System.out.println("Insira o valor da altura do triângulo: ");
        altura = scanner.nextDouble();

        area= (altura+base)/2;

        System.out.println("A área do triângulo com base "+base+ "(cm/m) e altura "+altura+ "(cm/m) é: "+area);



        scanner.close();
    }
    
}

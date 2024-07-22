package Aula;
import java.util.Scanner;
public class CalculoCirculo {
    public static void main(String[] args) {
        double pi=3.14;
        double diametro=0;
        double raio=0;
        double area=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do diametro do circulo: ");
        diametro= scanner.nextDouble();

        raio=diametro/2;
        area=pi*Math.pow(raio,2);

        System.out.println("A área do circulo é de: "+area);

        scanner.close();
    }
    
}

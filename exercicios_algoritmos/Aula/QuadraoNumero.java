package Aula;
import java.util.Scanner;

public class QuadraoNumero {
    public static void main(String[] args) {
        double num=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = scanner.nextFloat();

        num= Math.pow(num,2);

        System.out.println("O quadrado do valor digitado é: "+num);

        scanner.close();
    }
    
       
}

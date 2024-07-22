package Aula;
import java.util.Scanner;

public class AnosDiass {
    public static void main(String[] args) {
        int anos=0;
        int dias=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        anos = scanner.nextInt();

        dias=anos*365;

        System.out.println(+anos+ " anos equivalem a "+dias+ " dias");

        scanner.close();

    }
    
}

package Aula;
import java.util.Scanner;

public class HorasMinutos {
    public static void main(String[] args) {
        int horas=0;
        int minutos=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as horas que deseja: ");
        horas = scanner.nextInt();

        minutos=horas*60;

        System.out.println(+horas+" horas equivalem a: "+minutos+ " minutos");

        scanner.close();
    }
    
}

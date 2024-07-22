import java.util.Scanner;
public class idades {
    public static void main(String[] args) {
        int idades=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do fulano: ");
        idades = scanner.nextInt();

        if (idades>=0 && idades<=12){
            System.out.println("O fulano é uma criança");
        }
        else if(idades>=12 && idades <=18){
            System.out.println("O fulano é um adolescente");

        }
        else if(idades>=18 && idades<=60){
            System.out.println("O fulano é um adulto");

        }
        else{
            System.out.println("O fulano é um idoso");

        }
        scanner.close();
    }
}

import java.util.Scanner;
public class positivo_negativo {
    public static void main(String[] args) {
        int n1=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();

        if(n1>0){
            System.out.println("O número digitado é positivo ");
        }
        else if (n1<0){
            System.out.println("O número digitado é negativo");

        }
        else if(n1==0){
            System.out.println("O numero digitado é igual a zero");
        }
        scanner.close();
    }
}

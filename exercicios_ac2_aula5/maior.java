import java.util.Scanner;
public class maior {
    public static void main(String[] args) {
        int n1=0;
        int n2=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        n2 = scanner.nextInt();

        if (n1>n2){
            System.out.println("O número "+n1+ " é maior que o "+n2);
        }
        else{
            System.out.println("O número "+n2+ " é maior que o "+n1);
        }
    scanner.close();    
    }
    
}

import java.util.Scanner;
public class triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;

        System.out.println("Digite a medida do 1 lado do triângulo: ");
        a = scanner.nextInt();

        System.out.println("Digite a medida do 2 lado do triângulo: ");
        b = scanner.nextInt();

        System.out.println("Digite a medida do 3 lado do triângulo: ");
        c = scanner.nextInt();

        if(a==b && b==c){
            System.out.println("É um triângulo equilátero");
        }
        else if(a==b || b==c || a==c ){
            System.out.println("É um triângulo isóceles");
            }
        else if(a!=b && b!=c && a!=c){
            System.out.println("É um triângulo escaleno");
        }     
        scanner.close();

        }
    }
import java.util.Scanner;
public class par_impar{
    public static void main(String[] args) {
        int n1=0;
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite um número:  ");
        n1 = scanner.nextInt();

        if (n1%2 == 0){
            System.out.println("Este numéro é par");
                if(n1>=10 && n1<=50){
                    System.out.println("Dentro do range ");
                }
                else{
                    System.out.println("Fora do range");
                }
        }
        else{
            System.out.println("Este número é ímpar");
            if(n1>=11 && n1<=51){
                System.out.println("Dentro do range impar");
            }
            else{
                System.out.println("Fora do range impar");
            }
        }

    }
}
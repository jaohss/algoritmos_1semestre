import java.util.Scanner;
public class operacoes{
    public static void main(String[] args) {
        double n1=0;
        double n2=0;
        int oper=0;
        double resultado=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        n2 = scanner.nextDouble();

        System.out.println("=======================");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("=======================");

        System.out.println("Digite qual operação deseja realizar: ");
        oper = scanner.nextInt();

        switch(oper){
            case 1:
                resultado=n1+n2;
                break;
            case 2:
                if(n1>n2){
                    resultado=n1-n2;
                }
                else{
                    resultado=n2-n1;
                }
                break;
            case 3:
                resultado=n1*n2;
                break;
            case 4:
                resultado=(double)n1/(double)n2;
                break;
            default :
                break;

        }
        System.out.println("Resultado da operação é igual a: "+resultado);
        scanner.close();
               
    }
}
import java.util.Scanner;
public class positivo_zero {
   public static void main (String[]args) {
       int n1=0;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite um numero: ");
       n1 = scanner.nextInt();

       if(n1>0){
           System.out.println("Positivo");
       }
       else if(n1<0){
           System.out.println("Negativo");
       }
       else if(n1==0){
           System.out.println("Zero");
       }
       scanner.close();
   }
}

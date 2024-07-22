import java.util.Scanner;
public class anoBi {
    public static void main(String[] args) {
        int ano=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano desejado:  ");
        ano = scanner.nextInt ();

        if(ano%4==0){
            System.out.println("Este ano é bissexto");
        }
        else{
            System.out.println("Este ano não é bissexto.");
        }
        scanner.close();

    }
    
}

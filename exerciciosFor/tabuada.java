import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        int n=0, conta=0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o numero desejado: ");
        n = scn.nextInt();

        for(int i=1;i<=10;i++){
            conta=n*i;

            System.out.println(+n+ " x "+i+ " = "+conta);

        }
        scn.close();
    }
    
}

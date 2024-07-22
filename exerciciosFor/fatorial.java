import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {
        int n=0;
        int fator=1;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o numero para o calculo do fatorial: ");
        n = scn.nextInt();

        for(int i=1;i<=n;i++){
            fator=fator*i;
        }
        System.out.println(fator);
        scn.close();
    }
    
}

import java.util.Scanner;
public class dentro_fora {
    public static void main(String[] args) {
        int x=0, dentro=0, fora=0, n=0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Quantos numeros vão ser digitados: ");
        x = scn.nextInt();

        for (int i=1;i<=x;i++){
            System.out.println("Digite um numero:  ");
            n = scn.nextInt();

            if(n>=10 && n<=20 ){
                dentro++;
            }
            else {
                fora++;                
            }
            
        }
        System.out.println("Dentro: "+dentro);
        System.out.println("Fora: "+fora);

        scn.close();

    }
    
}

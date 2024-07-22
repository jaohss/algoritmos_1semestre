import java.util.Scanner;
public class par_impar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=0, x=0;

        System.out.println("Quantos numeros voce vai digitr: ");
        n = scn.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Digite um numero: ");
            x = scn.nextInt();

            if(x%2==0){
                if(x>0){
                    System.out.println("Par positivo");
                }
                else{
                    System.out.println("Par negativo");
                }

            }
            else{
                if(x>0){
                    System.out.println("Impar positivo");
                }
                else{
                    System.out.println("Impar negativo");
                }

            }
        }

        scn.close();
        
    }
    
}

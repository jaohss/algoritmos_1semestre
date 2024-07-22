import java.util.Scanner;
public class numPar {
    public static void main(String[] args) {
        int n=0;
        int soma=0;

        Scanner scn = new Scanner(System.in); 

        System.out.println("Digite o numero desejado: ");
        n = scn.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==0){
                soma=soma+i; 
                System.out.println("Numeros pares: "+i);
            }
        }
        System.out.println(soma);
        scn.close();

    }
    
}

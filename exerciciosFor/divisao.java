import java.util.Scanner;
public class divisao {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double num=0,den=0;
        double div=0;
        int n=0;

        System.out.println("Quantos numeros voce vai digitar ? ");
        n = scn.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Digite o numerador: ");
            num = scn.nextInt();

            System.out.println("Digite o denominador: ");
            den = scn.nextInt();

            

            if(den==0){
                System.out.println("Divisão Impossível");
            }
            else{
                div=num/den;
                System.out.println("Divisão= "+div);

            }

        }

        scn.close();
    }
    
}

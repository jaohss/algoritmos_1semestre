import java.util.Scanner;
public class numPares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=0, soma=0;

        System.out.println("Digite o valor de N: ");
        n = scn.nextInt();

        for(int i=0;i<=n;i++){

            for(int j=0;j<=n;j++){
                if(i%2==0 && j%2==0){
                    System.out.println(i);
                    soma=soma+i; 
                }
                else{
                    break;
                }
            }
        }
        System.out.println("");
        System.out.println(soma);

        scn.close();
    }

}

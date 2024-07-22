import java.util.Scanner;
public class soma_impares {
    public static void main(String[] args) {
        int x=0,y=0,soma=0 ;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite os dois numeros: ");
        x = scn.nextInt();
        y = scn.nextInt();

        for (int i=x;i<=y;i++){
            if(i%2!=0){
                System.out.println("N impares: "+i );
                soma=soma+i;

            }

        }
        System.out.println("Soma dos impares: "+soma);

        scn.close();
    }
    
}

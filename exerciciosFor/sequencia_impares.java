import java.util.Scanner;
public class sequencia_impares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=0;

        System.out.println("Digite o numero de x: ");
        n = scn.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        
        scn.close();
    }
    
}

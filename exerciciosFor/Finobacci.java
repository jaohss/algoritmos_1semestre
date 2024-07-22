import java.util.Scanner;

public class Finobacci {
    public static void main(String[] args) {
        int n=0;   
        int termo1=0, termo2=0,termoP=0;     
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o numero para limite da sequencia de fibonacci: ");
        n = scn.nextInt();

        termo1=0;
        termo2=1;

        for(int i=1;i<=n;i++){
            System.out.println(termo1);
            termoP=termo1+termo2;
            termo1=termo2;
            termo2=termoP;

        }

        scn.close();

    }
    
}

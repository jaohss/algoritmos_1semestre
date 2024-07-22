import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        int i=0, j=0,a=0,b=0, cont=0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o valor de i: ");
        a = scn.nextInt();

        System.out.println("Digite o valor de j: ");
        b = scn.nextInt();

        for(i=1;i<=a;i++){
            for (j=1;j<=b;j++){
                cont=i*j;
                System.out.println("matriz("+i+", "+j+")= "+cont);
            }
        }

        

        scn.close();
    }
    
}

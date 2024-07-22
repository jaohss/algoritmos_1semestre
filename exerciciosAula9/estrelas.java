import java.util.Scanner;
public class estrelas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        // um programa que imprima um padrão de estrelas conforme o exemplo a seguir. Quantidade de linhas é variavel e informado pelo usuário.

        int linhas=0;

        System.out.println("Digite quantas linhas serão impressas: ");
        linhas = scn.nextInt();// pede para o usuário quantas linhas serão usadas para as estrelas


        for(int i = 1; i <= linhas; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");//necessário NÃO ter a quebra de linha, para que as estrelas sejam impressas juntas 
            }
            System.out.println();
        }

        
        scn.close();

    }
    
}

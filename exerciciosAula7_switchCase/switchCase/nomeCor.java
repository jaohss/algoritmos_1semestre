package switchCase;
import java.util.Scanner;

public class nomeCor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String cor;

        System.out.println("Digite o nome de uma cor: ");
        cor = scn.next();

        switch(cor){
            case "amarelo":
                System.out.println("A mostarda é amarela");
                break;
            case "vermelho":
                System.out.println("O sangue é vermelho"); 
                break;   
            case "azul":
                System.out.println("O céu é azul");
                break;
            case "marrom":
                System.out.println("A terra é marrom");
                break;
            case "branco":
                System.out.println("As nuvens são brancas");
                break;
            case "preto":
                System.out.println("A coca-cola é preta");               
                break;
            default:
                System.out.println("Inválido");     
                break;
        }
        scn.close();




    }
    
}

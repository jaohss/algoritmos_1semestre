package switchCase;
import java.util.Scanner;
public class diaSemana {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int semana=0;

        System.out.println("Digite uma dia da semana(de 1 a 7): ");
        semana = scn.nextInt();

        switch(semana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;  
            case 4:
                System.out.println("Quarta-feira");
                break;  
            case 5:
                System.out.println("Quinta-feira");
                break;    
            case 6:
                System.out.println("Sexta-feira");
                break;  
            case 7:
                System.out.println("Sábado");
                break;      
            default:
                System.out.println("Número inválido");    
                break;
        }
        scn.close();
    }
    
}

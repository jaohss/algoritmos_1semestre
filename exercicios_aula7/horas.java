import java.util.Scanner;
public class horas {
    public static void main(String[] args){
        int hora=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        hora= scanner.nextInt();

        if (hora>=6 && hora <=12){
            System.out.println("Manhã");
        }
        else if (hora>=12 && hora<=18){
            System.out.println("Tarde");
        }
        else if (hora>=19 && hora<=24){
            System.out.println("Noite");
        }
        else if(hora>=0 && hora<=5){
            System.out.println("Madrugada");
        }
    }
    
}

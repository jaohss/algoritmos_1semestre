import java.util.Scanner;
public class idades{
    public static void main(String[] args) {
        int idade=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        idade = scanner.nextInt();

        if(idade>=0 && idade<=12){
            System.out.println("Crianças");
        }
        else if(idade>=13 && idade<=19){
            System.out.println("Adolescente");
        }
        else if(idade>=20 && idade<=25){
            System.out.println("jovem adulto");
        }
        else if(idade>=26 && idade<=59){
            System.out.println("Adultos");
        }
        else if(idade>=60){
            System.out.println("Idoso");
        }
        else{
            System.out.println("Idade inválida");
        }

        scanner.close();
    }
}
import java.util.Scanner;
public class peso_altura {
    public static void main(String[]args){
        double peso=0, altura=0, imc=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso do usuário: ");
        peso= scanner.nextDouble();

        System.out.println("Digite a altura do usuário: ");
        altura = scanner.nextDouble();

        imc=peso/Math.pow(altura,2);
        System.out.println("O MIC é igual: "+imc);

        if (imc<=18.5){
            System.out.println("Magreza");
        }
        else if(imc>=18.5 && imc <=24.9){
            System.out.println("Normal");
        }
        else if (imc>=25 && imc <=29.9){
            System.out.println("Sobrepeso");
        }
        else if(imc>=30 && imc<=39.9){
            System.out.println("Normal");
        }
        else if(imc>=40){
            System.out.println("Obeso");
        }



        scanner.close();
  }
 

}

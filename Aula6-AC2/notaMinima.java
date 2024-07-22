package aula_ac2;
import java.util.Scanner;
public class notaMinima{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double notaACI=0, notaACII=0, notaAF=0, notaAG=0, media=0,minima=0;

        System.out.println("Digite a nota minima global: ");
        minima = scn.nextDouble();

        System.out.println("Digite a nota da AC1: ");
        notaACI = scn.nextDouble();

        System.out.println("Digite a nota da AC2: ");
        notaACII = scn.nextDouble();

        System.out.println("Digite a nota da AF: ");
        notaAF = scn.nextDouble();

        System.out.println("Digite a nota da AG: ");
        notaAG = scn.nextDouble();

         media=(notaACI*0.15+notaACII*0.3+notaAF*0.45+notaAG*0.1)/1;

        if (media<minima){
            System.out.println("O aluno Fulano ficou com a nota média de "+media+ " que está abaixo da nota minima de aprovação, que é de " +minima+ " ,portanto está reprovado");
        }

        else{
            System.out.println("O aluno Fulano ficou com a nota média de "+media+ " que está acima da nota minima de aprovação, que é de " +minima+ " ,portanto está aprovado");
        }



    }
} 
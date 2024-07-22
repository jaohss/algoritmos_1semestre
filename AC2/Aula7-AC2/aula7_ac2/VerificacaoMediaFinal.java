package aula7_ac2;
import java.util.Scanner; 

 public class VerificacaoMediaFinal{
    public static void main(String[] args) {
        //Definição das variáveis 
        Scanner scn = new Scanner(System.in);
        double acI=0, acII=0, af=0, ag=0, media=0;

        System.out.println("Digite a nota da AC1: ");
        acI = scn.nextDouble();

        System.out.println("Digite a nota da AC2: ");
        acII = scn.nextDouble();

        System.out.println("Digite a nota da AF: ");
        af = scn.nextDouble();

        System.out.println("Digite a nota da AG: ");
        ag = scn.nextDouble();


        //Processamento e saída de dados
        media=(acI*0.15+acII*0.3+af*0.45+ag*0.1)/1;

        if (media >=0 && media<=2){     //Se a nota estiver entr 0.0 até 2.0, o aluno está reprovado
            System.out.println("O aluno está reprovado");
        }

        else if (media>= 2.1 && media <=4.9){   //Se a nota estiver entre 2.1 até 4.9, o aluno deverá realizar a prova substitutiva
            System.out.println("O aluna precisa realizar a prova substutiva");      
        }
        else if(media>=5){      //Se a a nota da média final for acima de 4.9, o aluno está aprovado
            System.out.println("O aluno está aprovado");
        }

        scn.close();

    }
 }
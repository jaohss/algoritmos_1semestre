package aula13af;
import java.util.Scanner;
public class Af {
    public static void main(String[] args) {

        //inicialização das variaveis
        Scanner scn = new Scanner(System.in);
        int QntdNotas=0,alunos=0;
        double notaPeso=0, somaPeso=0;
        
        //coleta de dados

        System.out.println("Digite a quantidade de alunos desejados: ");
        alunos = scn.nextInt();

        System.out.println("Digite a quantidade de notas desejada: ");
        QntdNotas = scn.nextInt();

        System.out.println("Digite a nota miníma de aprovação: ");
        double minima = scn.nextDouble();


        //inicialização dos vetores de dados
        double[] peso = new double[QntdNotas];
        double[] notas = new double[QntdNotas];
        double [] media = new double [alunos];
        String[] nome = new String[alunos];


        for(int i=0; i<QntdNotas;i++){
            System.out.println("Digite o peso para a "+(i+1)+ "ª nota");
            peso[i]=scn.nextDouble();
            
            somaPeso=somaPeso+peso[i];//soma total dos pesos para verificação

        }

        //verificação para saber se a soma total dos pesos é igual a 1
        if(somaPeso>1){
            System.out.println("A soma total dos pesos é maior que 1. Tente novamente.");
            return;
    
        }
        else if(somaPeso<1){
            System.out.println("A soma total dos pesos é menor que 1. Tente novamente.");
            return;
        }
    
        for(int i=0;i<alunos;i++){
            notaPeso=0;
            System.out.println("Digite o nome do aluno: ");
            nome[i] = scn.next();
            System.out.println(" ");

            for(int j=0; j<QntdNotas; j++){

                notaPeso=0;
                System.out.println("Digite o valor da "+(j+1)+"ª nota do Aluno "+nome[i]+": ");
                notas[j] = scn.nextDouble();

                notaPeso = notas[j]*peso[j];
                media[i] +=notaPeso;//calculo da media ponderada
                
            }
            System.out.println("A média do aluno "+nome[i]+" é igual a: "+media[i]);
            System.out.println(" ");

            //verificação para saber se o aluno está reprovado ou aprovado a partir de sua nota média em comparação com a nota minima de aprovação
            if(media[i]<minima){
                System.out.println("O aluno "+nome[i]+ " esta reprovado, pois sua nota da média foi inferior a nota miníma.");
            }
            else if(media[i]>=minima){
                System.out.println("O aluno "+nome[i]+ " esta aprovado, pois sua nota da média foi superior a nota miníma.");
            }

        }

        scn.close();
    }
    
}

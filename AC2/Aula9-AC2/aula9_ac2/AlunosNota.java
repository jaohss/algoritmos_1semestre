
import java.util.Scanner;
public class AlunosNota {

    public static void main(String[] args) {
        //Declaração de variávei
        Scanner scn = new Scanner(System.in);
        double nota=0,minima=0, peso=0,soma=0,  pond=0, totalPeso=0;
        int n=0, aluno=0;
        String nome;

        //Entrada de dados

        System.out.println("Quantos alunos serão perguntados sobre a nota ?");//quantidade de alunos a serem perguntados
        aluno = scn.nextInt();

        //quantidade de notas a serem inseridas
        System.out.println("Digite a quantidade de notas desejadas: ");
            n = scn.nextInt();

        //nota miníma para aprovação do aluno
        System.out.println("digite a nota miníma para a aprovação do aluno: ");
        minima = scn.nextDouble(); 

          
       
        //repetição da N alunos que vão ser perguntados
        for(int i=1;i<=aluno;i++) {  
            //nome de cada aluno a ser inserido
            System.out.println("Digite o nome do aluno: ");
            nome = scn.next(); 
            System.out.println(" ");      

            totalPeso=0;
            pond=0;
            soma=0;
            peso=0;
            
                //repetição de N notas que vão ser perguntadas para cada N alunos
                for(int j=1;j<=n;j++){                     

                    System.out.println("digite o valor da nota: "); //valor das notas
                    nota = scn.nextDouble();

                    System.out.println(" ");

                    System.out.println("Digite o peso da nota(entre 0,0 a 1,0): "); //peso das notas
                    peso = scn.nextDouble();

                    System.out.println(" ");

                    pond=nota*peso; //produto entre o valor da nota e seu peso 

                    soma=soma+pond; //a cada repetição, a variável 'soma' vai somar o seu valor com o da variável 'pond'

                    totalPeso=totalPeso+peso;//soma total somente dos PESOS digitados para cada nota

                    if(totalPeso>1){
                        System.out.println("O peso das notas é superior a 100%, portanto não é possível prosseguir. Tente novamente.");
                        return;
                    }
                                       
                   
                } 

                //o programa seguirá funcionando apenas se a somas dos PESOS forem menores ou iguais a 1  
            if(totalPeso<=1){

                //se soma das notas(produto entre nota e peso) forem maiores que a nota miníma será exibida a seguinte mensagem:
                if (soma<minima){
                    System.out.println("O aluno "+nome+ " ficou com a nota média de "+soma+ " que está abaixo da nota minima de aprovação, que é de " +minima+ ", portanto o aluno está reprovado");
                    System.out.println(" ");
                    }
        
                //caso ao contrário:
                else{
                    System.out.println("O aluno "+nome+" ficou com a nota média de "+soma+ " que está acima da nota minima de aprovação, que é de " +minima+ ", portanto está aprovado");
                    System.out.println(" ");
                    }

            } 
        
        }  
        
        scn.close();
    }
    
}

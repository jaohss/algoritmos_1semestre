package aula10_ac2;
import java.util.Scanner;

public class VerificacaoDados {

    public static void main(String[] args) {
        //Declaração de variávei
        Scanner scn = new Scanner(System.in);
        double nota=0,minima=0, peso=0,soma=0,  pond=0, totalPeso=0;
        int n=0, aluno=0;
        String nome;
        char dados = ' ';

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

                        
                
                do {
                        //reinicialização das variáveis caso a condição do while seja verdadeira 
                        totalPeso=0;
                        pond=0;
                        soma=0;
                        peso=0;

                        
                    for (int j = 1; j <= n; j++) {
                        //repetição de N notas que vão ser perguntadas para cada N alunos                        

                        System.out.print("Digite o valor da nota " + j + " para o aluno " + nome + ": ");
                        nota = scn.nextDouble();
    
                        System.out.print("Digite o peso da nota " + j + " (entre 0.0 e 1.0): ");
                        peso = scn.nextDouble();
    
                        pond = nota * peso; //produto entre o valor da nota e seu peso 

                        soma = soma+pond;//a cada repetição, a variável 'soma' vai somar o seu valor com o da variável 'pond'
                        
                        totalPeso = totalPeso+peso; //soma total somente dos PESOS digitados para cada nota
    
                        if (totalPeso > 1.0) {//se a soma dos pesos for maior que 1
                            System.out.println("O peso das notas é superior a 100% ");
                            
                        }
                    }
    
                    //verificação se o usuário deseja reinserir as notas do aluno 

                    System.out.print("Deseja reinserir as notas para o aluno " + nome + "? (S/N): ");
                    dados = scn.next().charAt(0);

                } while (dados == 'S' || dados == 's');  //se for digitado "s" ou "S", será repetida toda lógica anterior referente as NOTAS e PESOS
                //se for digitado um N/n por exemplo, o programa seguirá sem repetir

                 
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

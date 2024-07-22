 package aula8_ac2;
 import java.util.Scanner;

 public class NotaPeso{
    public static void main(String[] args) {
        //Declaração de variávei
        Scanner scn = new Scanner(System.in);
        double nota=0,minima=0, peso=0,soma=0,  pond=0, totalPeso=0;
        int n=0;

        //Entrada de dados

            //A quantidade de notas que serão digitadas
        System.out.println("Digite a quantidade de notas desejadas: ");
        n = scn.nextInt();

            //nota miníma para aprovação do aluno
        System.out.println("digite a nota miníma para a aprovação do aluno: ");
        minima = scn.nextDouble();
       
        //repetição da N notas que foram pedidas
        for(int i=1;i<=n;i++){ 
            System.out.println("digite o valor da nota: "); //valor das notas
            nota = scn.nextDouble();

            System.out.println("Digite o peso da nota(entre 0,0 a 1,0): "); //peso das notas
            peso = scn.nextDouble();

            pond=nota*peso; //produto entre o valor da nota e seu peso 

            soma=soma+pond; //a cada repetição, a variável 'soma' vai somar o seu valor com o da variável 'pond'

            totalPeso=totalPeso+peso;//soma total somente dos PESOS digitados para cada nota
            

            //Se a soma dos PESOS for maior que 1, será exibida a mensagem abaixo, caso o contrário, o programa dará seguimento

            if(totalPeso>1){
                System.out.println("O peso das notas é superior a 100%, portanto não é possível prosseguir. Tente novamente.");
                break;
            }
        }

        

        //o programa seguirá funcionando apenas se a somas dos PESOS forem menores ou iguais a 1  
        if(totalPeso<=1){

            //se soma das notas(produto entre nota e peso) forem maiores que a nota miníma será exibida a seguinte mensagem:
            if (soma<minima){
                System.out.println("O aluno Fulano ficou com a nota média de "+soma+ " que está abaixo da nota minima de aprovação, que é de " +minima+ ", portanto o aluno está reprovado");
            }
    
            //caso ao contrário:
            else{
                System.out.println("O aluno Fulano ficou com a nota média de "+soma+ " que está acima da nota minima de aprovação, que é de " +minima+ ", portanto está aprovado");
            }

        }
      
        
        scn.close();
    }
 }
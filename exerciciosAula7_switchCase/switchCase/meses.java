package switchCase;
import java.util.Scanner;
public class meses {
    public static void main(String[] args) {
        int mes=0;
        Scanner scn = new Scanner(System.in); 

        

        System.out.println("===================");
        System.out.println("Calendário");
        System.out.println("Janeiro - 1");
        System.out.println("Fevereiro - 2");
        System.out.println("Março - 3");
        System.out.println("Abril - 4");
        System.out.println("Maio - 5");
        System.out.println("Junho - 6");
        System.out.println("Julho - 7");
        System.out.println("Agosto - 8");
        System.out.println("Setembro - 9");
        System.out.println("Outubro - 10");
        System.out.println("Novembro - 11");
        System.out.println("Dezembro - 12");
        System.out.println("======================");  
        
        System.out.println("Digite o número correspondente ao mês que deseja: ");
        mes = scn.nextInt();

        switch(mes){
            case 1:
                System.out.println("Janeiro - eventos");
                System.out.println("1 - dia da confraternização universal");
                System.out.println("4 - Dia mundial do Braile");
                System.out.println("6 - Dia de Reis");
                System.out.println("9 - Dia do fico");
                System.out.println("25 - Aniversário da cidade de São Paulo");
                break;
            case 2:
                System.out.println("Carnaval");
                System.out.println("Quarta feira de cinzas");
                break;
            case 3:
                System.out.println("8 - Dia internacional da Mulher");
                System.out.println("22 - Dia da Água");
                break;
            case 4:
                System.out.println("1 - Dia da mentira");
                System.out.println("9 - Dia dos povos indígenas ");
                System.out.println("21 - Tiradentes");
                System.out.println("22 - Descobrimento do Brasil");
                System.out.println("Páscoa");
                System.out.println("Sexta-feira Santa");
                break;
            case 5:
                System.out.println("Dia das mães");
                System.out.println("1 - Dia do trabalho");
                System.out.println("Corpus Christi");
                break;
            case 6:
                System.out.println("12 - Dia dos Namorados");
                System.out.println("21 - Inicio do Inverno");
                System.out.println("24 - dia de São joão");
                break;
            case 7:
                System.out.println("Revolução Constitucionalista de 1932");
                break;

            case 8:
                System.out.println("Dia dos Pais");
                System.out.println("22 - Dia do Folclore");
                System.out.println("15 - Aniversário de Sorocaba");
                break;
            case 9:
                System.out.println("7 - Independência do Brasil");
                System.out.println("Primavera");
                break;
            case 10:
                System.out.println("12 - Dia das Crianças");
                System.out.println("15 - Dia dos Professores");
                System.out.println("31 - Dia das Bruxas");
                break;
            case 11:
                System.out.println("2 - Finados");
                System.out.println("15 - Proclamação da República");
                System.out.println("20 - Consciência Negra");
                break;
            case 12: 
                System.out.println("Verão");
                System.out.println("25 - Natal");
                System.out.println("Véspera de Ano-Novo");
                break;
            default: 
                System.out.println("Número inválido");    
                break;

        }
            scn.close();
    }
    
}

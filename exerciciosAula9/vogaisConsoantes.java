import java.util.Scanner;
public class vogaisConsoantes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String frase;
        int cons=0, vogais=0;

        System.out.println("Digite a frase:");
        frase = scn.nextLine();

        for (int caracteres=0; caracteres <frase.length(); caracteres++){
            for(int letras='a'; letras<='z';letras++ ){
                if(frase.charAt(caracteres)==letras){
                    if (letras == 'a' || letras=='e' || letras=='i' || letras=='o' || letras=='u'){
                        vogais++;
                    }
                    else{
                        cons++;
                    }
                }
            }
        }
        System.out.println("Vogais: "+vogais);
        System.out.println("Consoantes: "+cons);

        scn.close();
        
    }

}

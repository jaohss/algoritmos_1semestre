import java.util.Scanner;

public class alfabeto {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        char letra;

        System.out.println("Digite uma letra: ");
        letra = scn.next().charAt(0);
         
            for(char i = letra; i <= 'z'; i++){
                for (char j = letra; j<=i; j++){
                    System.out.print(j+" ");                
                    }
              System.out.println();
                
                }                               
           
        scn.close();
    }
    
}

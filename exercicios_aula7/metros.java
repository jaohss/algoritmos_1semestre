import java.util.Scanner;
public class metros {
    public static void main(String[]args) {
        int n1=0, escolha=0;
        double metroQuilo=0, metroCent=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos metros deseja converter: ");
        n1 = scanner.nextInt();

        System.out.println("====================");
        System.out.println("1) metro -> quilometro");
        System.out.println("2)metro -> centimetro");

        metroQuilo= (double)n1/1000;
        metroCent= (double)n1*100;
        
        System.out.println("Digite qual tipo de conversão deseja: ");
        escolha = scanner.nextInt();


        

        switch(escolha){
                case 1:
                    System.out.println("A conversão resulta em: "+metroQuilo+ "km");
                    break;
                case 2:
                    System.out.println("A conversão resulta em: "+metroCent+"cm");

        }

        scanner.close();
    }
}

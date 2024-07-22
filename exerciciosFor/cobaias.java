import java.util.Scanner;
public class cobaias{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char tipo;
        int coelho=0, sapo=0, rato=0, n=0, cob=0, total=0 ; 

        System.out.println("Quantos casos de teste serão digitados ? ");
        n = scn.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Quantidade de cobaias: ");
            cob = scn.nextInt();
            total=total+cob;
            
            System.out.println("Tipo de cobaia: ");
            tipo = scn.next().charAt(0);

                if(tipo == 's'){
                    sapo=sapo+cob;
                }
                else if(tipo=='r' ){
                    rato=rato+cob;
                }
                else if(tipo=='c'){
                    coelho=coelho+cob;
                }
               }

        double perRato=0, perCoelho=0, perSapo=0;
        
        perRato=(rato*100)/total;
        perCoelho=(coelho*100)/total;
        perSapo=(sapo*100)/total;

        System.out.println("Relatório final:");
        System.out.println("");
        System.out.println("Total: "+total+ " cobaias");    
        System.out.println("Total de coelhos: "+coelho);
        System.out.println("Total de ratos: "+rato);   
        System.out.println("Total de sapos: "+sapo);

        System.out.println("Percentual: ");
        System.out.println("");
        System.out.println("Percentual Ratos: "+perRato);
        System.out.println("Percentual sapos: "+perSapo);
        System.out.println("Percentual coelhos: "+perCoelho);

        scn.close();
    }
}
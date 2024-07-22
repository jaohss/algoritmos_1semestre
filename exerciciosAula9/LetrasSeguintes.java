import java.util.Scanner;

public class LetrasSeguintes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        // Imprime as letras seguintes até 'z' em linhas separadas
        for (char i = letra; i <= 'z'; i++) {
            for (char j = letra; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Pula para a próxima linha após cada conjunto de letras
        }

        scanner.close();
    }
}
package Aula;

import java.util.Scanner;

public class QuadradoNum {
    public static void main(String[] args) {
        int num=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        num = scanner.nextInt();

        double num1 = (double)num; //Cast para converter o numero inteiro em double para fazer o quadrado ou sua raíz

        double num2= Math.sqrt(num1);
        double num3 = Math.pow(num1,2);

        System.out.println("A raiz quadrada do número "+num1+ " equivale a: "+ num2+ " e o mesmo número ao quadrado equivale a: "+num3);

        scanner.close();

    }
    
}

package dio.basecamp;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**** Gerador de tabuada ****");
        System.out.print("Digite um número entre 1 e 10 para fazer a tabuada: ");
        int input = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(input + " X " + i + " = " + input*i);
        }
    }
}

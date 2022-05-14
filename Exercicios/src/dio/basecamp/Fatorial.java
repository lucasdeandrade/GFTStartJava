package dio.basecamp;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=====Fatorial=====");
        System.out.print("Digite um numero: ");
        int num = scan.nextInt();
        int total = 1;
        String mult = "";
        for (int i = num; i > 1 ; i--) {
            total *=i;
            mult += i + " x ";
        }
        System.out.println(mult + "1 = " + total);
        System.out.println("Fatorial de " + num + "! = " +total);
    }
}

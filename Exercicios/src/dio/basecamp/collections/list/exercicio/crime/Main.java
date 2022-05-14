package dio.basecamp.collections.list.exercicio.crime;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vitima?");
        perguntas.add("Devia para a vitima?");
        perguntas.add("Já trabalhou com a vitima?");

        System.out.println("Responda com S ou N");
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scan.next().toUpperCase();

            if(resposta.equals("S")) count++;
        }

        switch(count) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina!!");
                break;

        }
    }
}

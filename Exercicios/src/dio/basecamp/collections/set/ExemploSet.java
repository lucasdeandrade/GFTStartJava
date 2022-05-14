package dio.basecamp.collections.set;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("******HASHSET******");
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 6d, 7d, 8.5, 1.0));
        System.out.println(notas);
        System.out.println("-----------------------------------");

        System.out.println("Somar todos os valores do HashSet");
        Double soma = 0d;
        for (Double num: notas) {
            soma += num;
        }
        System.out.println(soma);
        System.out.println("-----------------------------------");

        System.out.println("Remover items menores do que 7 do HashSet");
        notas.removeIf(num -> num < 7d);
        System.out.println(notas);
        System.out.println("-----------------------------------");

        System.out.println("*****LINKEDHASHSET*****");
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(8d, 2d, 2.5, 6d, 5.5));
        System.out.println(notas2);
        System.out.println("-----------------------------------");

        System.out.println("*****TREESET*****");
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("-----------------------------------");

    }
}

package dio.basecamp.collections.list;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Gato> meusGatos =  new ArrayList<>(){{
            add(new Gato("John",10, "preto"));
            add(new Gato("Amanda", 12, "amarelo"));
            add(new Gato("Amanda",10, "vermelho"));
        }};

        System.out.println(meusGatos);

        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        Collections.sort(meusGatos);
        System.out.println(meusGatos);



    }
}

class Gato implements Comparable<Gato>{

    private String name;
    private Integer idade;
    private String cor;

    public Gato(String name, Integer idade, String cor) {
        this.name = name;
        this.idade = idade;
        this.cor = cor;
    }

    public String getName() {
        return name;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        int orderName = this.getName().compareToIgnoreCase(gato.getName());
        if (orderName != 0) return orderName;

        int orderIdade = Integer.compare(this.getIdade(), gato.getIdade());
        if (orderIdade != 0) return orderIdade;

        return this.getCor().compareToIgnoreCase(gato.getCor());
    }


}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}


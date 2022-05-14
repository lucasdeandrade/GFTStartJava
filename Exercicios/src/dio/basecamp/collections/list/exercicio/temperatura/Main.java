package dio.basecamp.collections.list.exercicio.temperatura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Temperatura> listTemperatura = new ArrayList<Temperatura>(){{
            add(new Temperatura(1, 30));
            add(new Temperatura(2, 28));
            add(new Temperatura(3, 31));
            add(new Temperatura(4, 28));
            add(new Temperatura(5, 25));
            add(new Temperatura(6, 23));
        }};

        double total = 0;
        for (Temperatura temp: listTemperatura) {
            total += temp.getTemperatura();
        }
        double media = total / 6;

        System.out.println(media);

        for (Temperatura temp: listTemperatura) {
            if (media < temp.getTemperatura()) System.out.println(temp.getMesString());
        }



    }
}

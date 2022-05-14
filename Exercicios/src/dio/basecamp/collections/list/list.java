package dio.basecamp.collections.list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class list {

    public static void main(String[] args) {

        listaDinamica();
//        System.out.println(list);
        List<Double> listDouble = new ArrayList<>(Arrays.asList(1.8, 5.3, 7.3, 8.9, 9.0));
        System.out.println(listDouble);

        Double sum = 0.0;
        for (Double i : listDouble) {
            sum += i;
        }
        System.out.println("soma: " + sum);

        // Usando iterator
        extracted(listDouble);

        listDouble.removeIf(n -> (n < 7d)); // Usando lambda

        System.out.println(listDouble);
    }

    private static void listaDinamica() {
        List<Object> list = new ArrayList<>(); // lista dinamica
        list.add("ss");
        list.add(2);
    }

    private static void extracted(List<Double> listDouble) {
        Iterator<Double> iterator = listDouble.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            if(next < 7) iterator.remove();
        }
    }


}

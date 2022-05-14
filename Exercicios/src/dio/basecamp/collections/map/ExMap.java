package dio.basecamp.collections.map;

import java.util.*;

public class ExMap {
    public static void main(String[] args) {
        Map<String, String> livros = new HashMap();
        livros.put("a", "111");
        livros.put("b", "222");
        livros.put("c", "333");
        System.out.println(livros);
        System.out.println(livros.get("c"));

        for (Map.Entry<String, String> livro : livros.entrySet()) {
            System.out.println(livro);
        }

        Map<String, String> livro2 = new LinkedHashMap();

        Map<String, String> livro3 = new TreeMap();

    }
}

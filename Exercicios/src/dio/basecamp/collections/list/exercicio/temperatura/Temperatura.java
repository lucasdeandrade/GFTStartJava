package dio.basecamp.collections.list.exercicio.temperatura;

import java.util.ArrayList;
import java.util.List;

public class Temperatura {
    private int mes;
    private double temperatura;

    private List<String> mesStringPtList = new ArrayList<>(){{
        add("Janeiro");
        add("Fevereiro");
        add("Março");
        add("Abril");
        add("Maio");
        add("Junho");
    }};

    public Temperatura(int mes, double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMesString(){
        return mesStringPtList.get(this.mes - 1) + " | " +this.temperatura + "º";
    }

    public int getMes() {
        return mes;
    }


    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes=" + mes +
                ", temperatura=" + temperatura +
                '}';
    }
}

package dio.basecamp;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {
//        double valor1 = 2;
//        double valor2 = 2;
//
//        System.out.println("soma: " + soma(valor1, valor2));
//        System.out.println("subtração: " + subtracao(valor1, valor2));
//        System.out.println("multiplicação: " + multiplicacao(valor1, valor2));
//        System.out.println("divisão: " + divisao(valor1, valor2));
//
//        boasVindas();

        System.out.println(Banco.emprestimo(1000, 5));

        double quadrado = Quadrilateros.CalcArea(4);
        double retangulo = Quadrilateros.CalcArea(5, 4);
        double trapaezio = Quadrilateros.CalcArea(5, 6, 8);

        System.out.println("A área do quadrado é: " + quadrado);
        System.out.println("A área do retangulo é: " + retangulo);
        System.out.println("A área do trapaezio é: " + trapaezio);


    }

    static double soma(double v1, double v2) {
        return v1 + v2;
    }

    static double subtracao(double v1, double v2) {
        return v1 - v2;
    }

    static double multiplicacao(double v1, double v2) {
        return v1 * v2;
    }

    static double divisao(double v1, double v2) {
        return v1 / v2;
    }


    static void boasVindas() {
        int hr = new Time(System.currentTimeMillis()).toLocalTime().getHour();

        if(hr > 0 && hr < 12){
            System.out.println("Bom dia!!");
        }
        else if(hr >= 12 && hr < 18){
            System.out.println("Boa tarde!!");
        }
        else {
            System.out.println("Boa noite!!");
        }
    }


}


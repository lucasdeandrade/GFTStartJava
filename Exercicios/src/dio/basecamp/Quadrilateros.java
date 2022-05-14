package dio.basecamp;

public class Quadrilateros {

    static double CalcArea(double lado) {
        return lado * lado;
    }

    static double CalcArea(double base, double altura) {
        return base * altura;
    }

    static double CalcArea(double baseMaior, double baseMenor, double altura) {
        return (baseMaior + baseMenor) * altura / 2;
    }
    


}

package dio.basecamp;

public class Banco {

    static double emprestimo (double valor, int parcela) {
        return valor * (taxa(parcela) * parcela);

    }

    private static double taxa (int parcela) {
        if(parcela <= 3){
            return 1.03;
        } else if (parcela > 3 && parcela < 10) {
            return 1.0565;
        } else {
            return 1.08;
        }
    }
}

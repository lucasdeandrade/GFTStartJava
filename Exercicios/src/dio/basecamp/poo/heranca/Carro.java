package dio.basecamp.poo.heranca;

public class Carro extends Veiculo {

    public Carro(String cor, String modelo, int capacidadeTanque) {
        super(cor, modelo, capacidadeTanque);
    }

    public Carro(int capacidade) {
        super();
    }

    public Carro(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public void virar() {
        System.out.println("Virando carro...");
    }

    @Override
    public String toString() {
        return "Carro {"+ " cor: " + getCor()
                + ", modelo: " + getModelo()
                + ", capacidade: " + getCapacidadeTanque()+" }";
    }
}


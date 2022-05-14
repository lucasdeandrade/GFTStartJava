package dio.basecamp.poo.heranca;

public class Caminhao extends Veiculo{


    public Caminhao(String cor, String modelo, int capacidadeTanque) {
        super(cor, modelo, capacidadeTanque);
    }

    @Override
    public void virar() {
        System.out.println("Virando...");
    }

    @Override
    public String toString() {
        return "Caminhão {"+ " cor: " + getCor()
                + ", modelo: " + getModelo()
                + ", capacidade: " + getCapacidadeTanque()+" }";
    }
}

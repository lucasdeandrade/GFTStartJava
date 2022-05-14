package dio.basecamp.poo.heranca;

public class Motocicleta extends Veiculo{

    public Motocicleta(String cor, String modelo, int capacidadeTanque) {
        super(cor, modelo, capacidadeTanque);
    }

    @Override
    public String toString() {
        return "Motocicleta {"+ " cor: " + getCor()
                             + ", modelo: " + getModelo()
                             + ", capacidade: " + getCapacidadeTanque()+" }";
    }

    @Override
    public void virar() {
        System.out.println("Virando o guidon...");
    }
}

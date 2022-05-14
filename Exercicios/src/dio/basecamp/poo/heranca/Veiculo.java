package dio.basecamp.poo.heranca;

public abstract class Veiculo {
    private String cor;
    private String modelo;
    private int capacidadeTanque;

    public abstract void virar();

    public Veiculo(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Veiculo() {
    }
    public Veiculo(String modelo, int capacidade) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Double tanqueCheio(Double preco){
        return preco * this.capacidadeTanque;
    }

}

package dio.basecamp.poo.associacao;

public class Endereco {
    String cidade;
    String estado;
    String rua;
    String numero;

    public Endereco(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}

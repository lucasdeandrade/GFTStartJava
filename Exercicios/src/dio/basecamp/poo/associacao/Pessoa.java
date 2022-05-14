package dio.basecamp.poo.associacao;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private Endereco endereco;

    Pessoa(){
        this.nome = "Lucas";
        this.idade = 27;
        this.sexo = "Macho";
    }

    void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", endereco=" + endereco +
                '}';
    }


}

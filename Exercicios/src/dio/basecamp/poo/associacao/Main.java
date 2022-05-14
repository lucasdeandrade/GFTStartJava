package dio.basecamp.poo.associacao;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setEndereco(new Endereco("taubate", "SP"));
        System.out.println(pessoa1);
        System.out.println(pessoa1.getEndereco());
    }
}

package dio.basecamp.bancoDigital;

import java.util.Objects;

public abstract class Conta implements IConta {

    private String senha;
    private static final String AGENDIA_PADRAO = "0001";
    protected String agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente, String senha) {
        this.agencia = Conta.AGENDIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.senha = senha;
    }


    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean autenticacao(String senha, int numeroConta){
        return Objects.equals(this.senha, senha) && this.numeroConta == numeroConta;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public void imprimirExtrato() {
        System.out.println("=== Extrato ===");
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agencia: %s\n", this.agencia);
        System.out.printf("Numero: %d\n", this.numeroConta);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
}

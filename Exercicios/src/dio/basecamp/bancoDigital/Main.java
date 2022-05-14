package dio.basecamp.bancoDigital;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        Banco santander = new Banco("Santander");
        Scanner scan = new Scanner(System.in);
        Cliente daiane = new Cliente("Daiane", "45678912287");

        Conta cc = new ContaCorrente(daiane, "1234");
        santander.adicionarConta(cc);
        Conta cp = new ContaPoupanca(daiane, "4321");
        santander.adicionarConta(cp);


        while (true) {

            menuPrincipal();
            int resp = scan.nextInt();

            switch (resp) {
                case 1:
                    System.out.print("Informe o valor do deposito: ");
                    int valor = scan.nextInt();

                    System.out.print("Informe o numero da conta: ");
                    int nconta = scan.nextInt();

                    for (Conta conta : santander.getContas()) {
                        if (conta.getNumero() == nconta) {
                            conta.depositar(valor);
                            System.out.println("Deposito feito com sucesso!");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Insira o numero da conta: ");
                    int numeroConta = scan.nextInt();
                    System.out.print("Senha: ");
                    String senha = scan.next();

                    for (Conta conta : santander.getContas()) {
                        if (conta.autenticacao(senha, numeroConta)) {
                            System.out.println("Entrando...\n");
                            sleep(1000);
                            boolean logged = true;
                            while (logged) {
                                menuLogado(conta);
                                int opcao = scan.nextInt();
                                switch (opcao) {
                                    case 0:
                                        logged = false;
                                        break;
                                    case 1:
                                        System.out.println("Seu saldo é de " + conta.getSaldo());
                                        break;
                                    case 2:
                                        System.out.print("Insira o valor: ");
                                        int valorTrans = scan.nextInt();
                                        System.out.print("Digite o numero da conta: ");
                                        int numTrans = scan.nextInt();

                                        for (Conta contaTrans : santander.getContas()) {
                                            if (conta.getSaldo() < valorTrans) {
                                                System.out.println("Saldo insuficiente");
                                                break;
                                            } else if (conta != contaTrans && contaTrans.getNumero() == numTrans) {
                                                conta.transferir(valorTrans, contaTrans);
                                                System.out.println("Transferencia feita com sucesso");
                                            }
                                        }
                                        break;
                                    case 3:
                                        System.out.print("Digite o valor: ");
                                        int saqValor = scan.nextInt();
                                        conta.sacar(saqValor);
                                    default:
                                        System.out.println("Opção invalida");
                                }
                            }
                        }
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }

    public static void menuPrincipal() {
        System.out.println("\n=== Bem Vindo ao Banco ===");
        System.out.println("No que posso ajudar?(Escolha as opçôes abaixo)");
        System.out.println("1 - Fazer um Deposito");
        System.out.println("2 - Entrar");
        System.out.println("0 - Sair");
    }
    public static void menuLogado(Conta conta){
        System.out.println("\nOla " + conta.cliente.getNome() + ", o que deseja? ");
        System.out.println("1 - Saldo");
        System.out.println("2 - Transferencia");
        System.out.println("3 - Saque");
        System.out.println("0 - Sair");
    }
}


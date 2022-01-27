package br.com.dio.miller;

public class App {
    public static void main(String[] args) {
        Cliente miller = new Cliente("Miller");

        Conta contaCorrente = new ContaCorrente(miller);
        Conta contaPoupanca = new ContaPoupanca(miller);

        contaPoupanca.depositar(1000);
        contaCorrente.depositar(2000);

        contaCorrente.transferir(500, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}

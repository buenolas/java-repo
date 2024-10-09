package lab;

public class Cadastro {
    public static void main(String[] args) {
        // Contas Corrente, Poupança e Salário
        ContaCorrente contaCorrente = new ContaCorrente(123, "João", 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(456, "Maria", 2000.0);
        ContaSalario contaSalario = new ContaSalario(789, "Pedro", 3000.0);

        // Configurar saldos e operações iniciais
        contaCorrente.depositar(500);
        contaSalario.depositar(500);
        contaPoupanca.sacar(200);

        // Atualizar saldo da poupança
        contaPoupanca.atualizarSaldo(10);

        // Transferência entre contas
        contaCorrente.transferir(contaSalario, 300);
        contaSalario.transferir(contaPoupanca, 150);

        // Exibir saldos
        System.out.println("Saldo final Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo final Conta Poupança: " + contaPoupanca.getSaldo());
        System.out.println("Saldo final Conta Salário: " + contaSalario.getSaldo());
    }
}


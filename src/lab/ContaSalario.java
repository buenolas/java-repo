package lab;

public class ContaSalario extends ContaCorrente {
    private static final double TAXA_SALARIO = 0.01;

    public ContaSalario(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + TAXA_SALARIO); // Aplica taxa reduzida de 0,01
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - TAXA_SALARIO); // Aplica taxa reduzida de 0,01
    }
}


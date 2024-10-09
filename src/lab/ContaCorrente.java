package lab;

public class ContaCorrente extends Conta {
    private static final double TAXA = 0.05;

    public ContaCorrente(int numero, String titular, double saldo){
        super(numero, titular, saldo);
    }

    @Override
    public void depositar(double valor){
        super.depositar(valor - TAXA);
    }

    @Override
    public void sacar(double valor){
        super.sacar(valor + TAXA);
    }
}

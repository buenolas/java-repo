package lab;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, String titular, double saldo){
        super(numero, titular, saldo);
    }

    public void atualizarSaldo(double percentual){
        saldo += saldo * (percentual / 100);
    }
}

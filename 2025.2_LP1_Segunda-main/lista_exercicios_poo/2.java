public class ContaBancaria {
    private double saldo;
    private int numberoConta;
    private String titular;

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(ContaBancaria destino, double valor) {
        saldo -= valor;
        destino.saldo += valor;
    }
}

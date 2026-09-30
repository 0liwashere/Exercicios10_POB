public class ContaCorrente {

    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente na conta " + numero + 
                ". Saldo disponível: " + saldo + ", valor solicitado: " + valor
            );
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}

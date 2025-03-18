package entitites;

public class Conta {
    private int numero, agencia;
    private double saldo;
    public void iniciarContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }

    public void sacar(double valor){
        if(valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para saque.");
        } else{
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }

    }
    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }
    public double consultarSaldo(){
        return (saldo);
    }

    public void exibe() {
        System.out.printf("\nAgência: %d\nConta: %d\nSaldo: R$ %.2f\n", agencia, numero, saldo);
    }
}

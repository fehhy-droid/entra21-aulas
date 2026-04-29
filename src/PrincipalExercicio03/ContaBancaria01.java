package PrincipalExercicio03;

public class ContaBancaria01 {
    double saldo;

    public ContaBancaria01(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo invalido");
            //throw new IllegalAccessException();
        }

        this.saldo = saldo;
    }
    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("valor invalido");
        } else {
            this.saldo = this.saldo + valor;
        }
    }
    String sacar(double valor) {
        if (valor <= 0) {
            return "Valor inválido";
        } else if (valor > saldo) {
            return "Saldo insuficiente";
        } else {
            this.saldo = this.saldo - valor;
            return "Saque efetuado, seu novo saldo é de " + this.saldo;
        }
    }
}

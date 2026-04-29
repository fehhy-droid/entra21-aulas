package PolimorfismoExercicio1.exemplo3;

public class CartãoDeCredito extends MetodoPagamento {

    @Override
    public void pagarAVista() {
        System.out.println("Pagando com Cartão de crédito");
    }
}

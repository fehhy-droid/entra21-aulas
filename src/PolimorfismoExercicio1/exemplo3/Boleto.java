package PolimorfismoExercicio1.exemplo3;

public class Boleto extends MetodoPagamento {

    @Override
    public void pagarAVista() {
        System.out.println("Pagando com boleto!");
    }
}

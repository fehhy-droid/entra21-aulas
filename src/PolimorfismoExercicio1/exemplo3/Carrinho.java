package PolimorfismoExercicio1.exemplo3;

public class Carrinho {
    private double valorCompra;

    public Carrinho(double valorCompra) {
        this.valorCompra = valorCompra;

    }

    public void realizaCompra(MetodoPagamento metodoPagamento) {
        metodoPagamento.pagarAVista();
        System.out.println("Compra realizada com sucesso!");
    }

}

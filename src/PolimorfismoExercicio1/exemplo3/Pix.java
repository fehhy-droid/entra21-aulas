package PolimorfismoExercicio1.exemplo3;

public class Pix  extends  MetodoPagamento {

    @Override
    public void pagarAVista() {
        System.out.println("Pagando a vista com Pix");
    }
}

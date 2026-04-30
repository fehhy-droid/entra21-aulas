package POO.BASICO.Abstracao.Exemplo2;

public class Pix extends Pagamento {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Pagamento com Pix! ");
    }
}

package POO.BASICO.Abstracao.Exemplo2;

public class Boleto extends Pagamento {

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Pagamento com Boleto!");
    }
}

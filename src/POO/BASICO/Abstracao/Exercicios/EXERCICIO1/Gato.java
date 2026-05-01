package POO.BASICO.Abstracao.Exercicios.EXERCICIO1;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + "Miau Miau gatinho");
    }
}

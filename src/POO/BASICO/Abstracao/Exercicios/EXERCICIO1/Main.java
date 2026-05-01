package POO.BASICO.Abstracao.Exercicios.EXERCICIO1;

public class Main {
    public static void main(String[] args) {

        Animal Cachorro = new Cachorro("Renato ");
        Animal Gato = new Gato("Lord Valdemort ");

        Cachorro.emitirSom();
        Gato.emitirSom();
    }
}

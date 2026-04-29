package PolimorfismoExercicio1.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        Animal rex = new Cachorro();
        Animal sushi = new Gato();

        animalGenerico.emitirSom();
        rex.emitirSom();
        sushi.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.perseguirCarteiro();
    }
}

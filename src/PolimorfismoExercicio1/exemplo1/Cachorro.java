package PolimorfismoExercicio1.exemplo1;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("AU AU!");
    }

    public void perseguirCarteiro() {
        System.out.println("Volta aqui demonio");
    }
}


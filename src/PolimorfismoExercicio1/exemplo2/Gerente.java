package PolimorfismoExercicio1.exemplo2;

public class Gerente extends Funcionario {
    @Override
    public double calculapagamento() {
        return super.calculapagamento() + 1_000d;
    }
}

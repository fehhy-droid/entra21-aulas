package PolimorfismoExercicio1.exemplo2;

public class Funcionario {
    private double salarioBase;

        public double getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }

        public double calculapagamento() {
            return this.salarioBase;
        }
    }


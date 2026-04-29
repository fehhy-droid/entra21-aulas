package PolimorfismoExercicio1.exemplo2;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(double salarioBase, double comissao) {
        super.setSalarioBase(salarioBase);
        this.comissao = comissao;

    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void steComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calculapagamento() {
        return super.getSalarioBase() + this.comissao;
    }
}

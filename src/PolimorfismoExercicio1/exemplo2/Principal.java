package PolimorfismoExercicio1.exemplo2;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        gerente.setSalarioBase(10_000d);

        System.out.println("O salário do gerente é: " + gerente.calculapagamento());

        Funcionario funcionarioComum = new Funcionario();
        funcionarioComum.setSalarioBase(3000d);
        System.out.println("O salário do funcionario é: " + funcionarioComum.calculapagamento());

        Funcionario vendedor = new Vendedor(2000d, 3000d);
        System.out.println("O salario do vendedor é: " + vendedor.calculapagamento());

    }
}

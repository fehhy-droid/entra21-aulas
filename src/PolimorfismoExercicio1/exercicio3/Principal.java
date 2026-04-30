package PolimorfismoExercicio1.exercicio3;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionarioFernando = new Funcionario();
        Professor professorLuid = new Professor();
        Designer designerFernanda = new Designer();
        Programador programadorLucas = new Programador();

        funcionarioFernando.funcionarioTrabalhar();
        professorLuid.funcionarioTrabalhar();
        designerFernanda.funcionarioTrabalhar();
        programadorLucas.funcionarioTrabalhar();

    }
}

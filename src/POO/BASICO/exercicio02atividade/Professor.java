package POO.BASICO.exercicio02atividade;

import POO.BASICO.exemplo03.Produto;

public class Professor extends Pessoa {

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    public void apresentar() {
        System.out.println("Nome: " + super.getNome());
    }
}

package POO.BASICO.Herança;

public class Aluno extends Pessoa {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public Aluno(int idade, String nome, String matricula) {
        super(idade, nome);
        this.matricula = matricula;
    }

    public void apresentar() {
        System.out.println("Meu nome é: " + super.getNome() + "eu sou aluno!");
    }
}

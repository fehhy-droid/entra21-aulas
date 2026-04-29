package POO.BASICO.Herança;

public class Principal {
    public  static void main(String[] args) {
        Pessoa pessoa = new Pessoa(18, "Fernando");
        Aluno aluno = new Aluno(18, "luidi", "12563");

        aluno.apresentar();
        System.out.println("Descrição aluno:" + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matricula aluno: " + aluno.getMatricula());

    }
}

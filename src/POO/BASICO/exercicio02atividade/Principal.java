package POO.BASICO.exercicio02atividade;

public class Principal {
    public static void main(String[] args) {
        Professor professor = new Professor("Maria", "Fehhy@entra21.com", "java");

        professor.apresentar();
        System.out.println("Email: " + professor.getEmail());
        System.out.println("Disciplina: " + professor.getDisciplina());

    }
}

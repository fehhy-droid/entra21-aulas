package POO.BASICO;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome);
        System.out.println("Minha idade é " + this.idade);
        System.out.println("Meu peso é " + this.peso);
    }
}


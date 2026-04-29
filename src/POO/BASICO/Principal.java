package POO.BASICO;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fernanda", 25, 65.5);
        Pessoa pessoa2 = new Pessoa("Luid", 79, 62.7);

        //pessoa1.apresentar();
        //pessoa2.apresentar();

        Carro carro1 = new Carro();
        carro1.ano = 2017;
        carro1.cor = "branco";
        carro1.marca = "Toyota";
        carro1.modelo = "Hilux";
        carro1.dono = pessoa1;

        carro1.ligar();
    }
}


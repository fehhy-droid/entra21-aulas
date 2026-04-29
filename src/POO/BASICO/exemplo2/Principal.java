package POO.BASICO.exemplo2;

import POO.BASICO.Herança.Vendedor;

public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("jean", 100_000d, 500_000d);
        System.out.println("O salario total de " + vendedor.getNome() + " é " + vendedor.getSalarioTotal());

    }
}

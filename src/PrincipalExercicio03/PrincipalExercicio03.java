package PrincipalExercicio03;

public class PrincipalExercicio03 {
    public static void main(String[] args) {
        ContaBancaria01 cb = new ContaBancaria01(100);

        System.out.println(cb.sacar(20));

        System.out.println(cb.sacar(-50));

        System.out.println(cb.sacar(0));

        System.out.println(cb.sacar(10_000));
    }
}


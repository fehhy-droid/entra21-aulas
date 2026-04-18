package Basico.Basico.vetores;

public class Vetores03 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int numero:numeros) {
            System.out.println(numero);
        }
    }
}

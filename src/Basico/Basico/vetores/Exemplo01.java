package Basico.Basico.vetores;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        //Crie um array para armazenar 3 nomes. Peça do usuário para digitar os nomes e, em seguida, exiba-os
        String[] nomes = new String[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = teclado.next();
        }

        for (String nome: nomes) {
            System.out.println("O nome é: " + nome);
        }
    }
}

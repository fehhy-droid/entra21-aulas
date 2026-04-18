package Basico;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {
        // Enquanto
        // Peça pro usuário digitar um numero até digitar um numero negativo.
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        //Enquanto
        while (num >= 0) {
            System.out.print("Digite um número: ");
            num = teclado.nextInt();
        }
    }
}

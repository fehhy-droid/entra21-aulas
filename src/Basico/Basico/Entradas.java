package Basico.Basico;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.println("Escreva sua idade: ");
        idade = teclado.nextInt();

        String nome;
        System.out.println("Digite seu nome: ");
        nome = teclado.next();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
    }
}

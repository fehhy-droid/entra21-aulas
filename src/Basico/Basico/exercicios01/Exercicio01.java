package Basico.Basico.exercicios01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // 1. Crie um programa que verifique se um número digitado pelo usuário
        // é positivo, negativo ou zero. Imprima a mensagem correspondente.

        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if (num > 0) {
            System.out.println("É Positivo!");
        } else if (num < 0) {
            System.out.println("É Negativo");
        } else {
            System.out.println("É Zero");
        }

    }
}

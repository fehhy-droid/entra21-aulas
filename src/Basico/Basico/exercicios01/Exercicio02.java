package Basico.Basico.exercicios01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //3. Crie um programa que peça ao usuário para digitar três números inteiros.
        // Verifique se pelo menos dois dos números são iguais entre si.
        // Se sim, imprima "Pelo menos dois números são iguais",
        // caso contrário, imprima "Nenhum dos números é igual aos outros."

        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = teclado.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = teclado.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Dois iguais");
        } else {
            System.out.println("Nenhum igual");
        }
    }
}

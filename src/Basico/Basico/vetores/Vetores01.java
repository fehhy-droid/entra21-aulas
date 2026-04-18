package Basico.Basico.vetores;

import java.util.Scanner;

public class Vetores01 {
    public static void main(String[] args) {
        // Ler 3 idades do usuario
        Scanner sc = new Scanner(System.in);
        //Tipo[] nomeVariavel = new Tipo[]
        int[] idades = new int[3];
        idades[0] = sc.nextInt();
        idades[1] = sc.nextInt();
        idades[2] = sc.nextInt();

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}

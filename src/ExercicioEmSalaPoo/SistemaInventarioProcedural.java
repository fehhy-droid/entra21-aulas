package ExercicioEmSalaPoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaInventarioProcedural {

    // lista precisa ser global para os métodos usarem
    private static List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Inventário ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Calcular Valor Total do Estoque");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome : ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço : ");
                    double preco = scanner.nextDouble();

                    System.out.print("Quantidade : ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    Produto produto = new Produto(nome, preco, quantidade);
                    produtos.add(produto);
                    break;

                case 2:
                    listarProdutos();
                    break;

                case 3:
                    calcularTotal();
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

    // método listar
    public static void listarProdutos() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }
    }

    // método calcular total
    public static void calcularTotal() {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }

        System.out.println("Valor total do estoque: " + total);
    }
}
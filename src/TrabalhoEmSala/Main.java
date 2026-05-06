package TrabalhoEmSala;

import TrabalhoEmSala.Gerenciadores.GerenciadorAstronauta;
import TrabalhoEmSala.Gerenciadores.GerenciadorMissoes;
import TrabalhoEmSala.Gerenciadores.GerenciadorNave;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorMissoes gerenciadorMissoes = new GerenciadorMissoes();
        GerenciadorNave gerenciadorNave = new GerenciadorNave();
        GerenciadorAstronauta gerenciadorAstronauta = new GerenciadorAstronauta();

        //
//        Astronauta astronauta = new Astronauta("Neil Armstrong", "Comandante");
//        NaveEspacial nave = new NaveEspacial("Discovery One", "Exploração", "5");
//        Missao missao = new Missao("Marte", "Explorar a superficie de marte", "2025-01-15", "Planejada");
//        Missao missao2 = new Missao("Marte", "Explorar a superficie de marte", "2025-01-15", "Planejada");
//        Astronauta astronauta1 = new Astronauta("Buzz Aldrin", "Piloto");

        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n--- Sistema de Gerenciamento de Exploração Espacial ---");
            System.out.println("1. Adicionar Missão");
            System.out.println("2. Adicionar Nave Espacial");
            System.out.println("3. Adicionar Astronauta");
            System.out.println("4. Listar Missões");
            System.out.println("5. Listar Naves");
            System.out.println("6. Listar Astronautas");
            System.out.println("7. Associar Nave a Missão");
            System.out.println("8. Associar Astronauta a Missão");
            System.out.println("9. Atualizar Status da Missão");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número.");
                scanner.next();
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:


                    System.out.print("Nome da Missão: ");
                    String nomeMissao = scanner.nextLine();
                    System.out.print("Objetivo da Missão: ");
                    String objetivoMissao = scanner.nextLine();
                    System.out.print("Data de Lançamento (AAAA-MM-DD): ");
                    String dataLancamento = scanner.nextLine();
                    System.out.print("Status (Planejada, Em Andamento, Concluída, Cancelada): ");
                    String statusMissao = scanner.nextLine();
                    gerenciadorMissoes.adicionarMissao(nomeMissao, objetivoMissao, dataLancamento, statusMissao);
                    break;

                case 2:

                    System.out.print("Nome da Nave: ");
                    String nomeNave = scanner.nextLine();
                    System.out.print("Tipo da Nave: ");
                    String tipoNave = scanner.nextLine();
                    System.out.print("Capacidade da Nave: ");
                    String capacidadeNave = scanner.nextLine();
                    gerenciadorNave.adicionarNave(nomeNave, tipoNave, capacidadeNave);
                    break;

                case 3:

                    System.out.print("Nome do Astronauta: ");
                    String nomeAstronauta = scanner.nextLine();
                    System.out.print("Especialidade do Astronauta: ");
                    String especialidadeAstronauta = scanner.nextLine();
                    gerenciadorAstronauta.adicionarAstronauta(nomeAstronauta, especialidadeAstronauta);
                    break;

                case 4:
                    gerenciadorMissoes.listarMissoes();

                    break;

                case 5:
                    gerenciadorNave.listarNaves();

                    break;

                case 6:
                    gerenciadorAstronauta.listarAstronauta();

                    break;

                case 7:
                    System.out.print("ID da Missão para associar nave: ");
                    int idMissaoAssocNave = scanner.nextInt();
                    System.out.print("ID da Nave para associar: ");
                    int idNaveAssoc = scanner.nextInt();
                    gerenciadorMissoes.associarNaveAMissao(idMissaoAssocNave, idNaveAssoc);
                    break;
            }
        }while(opcao!=0);

    }
}

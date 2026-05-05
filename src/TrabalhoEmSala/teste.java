package TrabalhoEmSala;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class teste {


    /**
     * SISTEMA DE GERENCIAMENTO DE EXPLORAÇÃO ESPACIAL (VERSÃO PROCEDURAL)
     *
     * Este código é funcional, mas não utiliza os pilares da POO.
     * O desafio dos alunos é refatorar este sistema criando classes,
     * aplicando encapsulamento, herança e polimorfismo.
     */

        // Simula um banco de dados de missões: [ID, Nome, Objetivo, DataLançamento, Status, NomeNave, NomesAstronautas]
        private static List<String[]> missoes = new ArrayList<>();
        // Simula um banco de dados de naves: [ID, Nome, Tipo, Capacidade]
        private static List<String[]> naves = new ArrayList<>();
        // Simula um banco de dados de astronautas: [ID, Nome, Especialidade]
        private static List<String[]> astronautas = new ArrayList<>();

        private static int proximoIdMissao = 1;
        private static int proximoIdNave = 1;
        private static int proximoIdAstronauta = 1;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;

            // Dados iniciais para teste
            adicionarMissao("Missão Marte", "Explorar a superfície de Marte", "2025-01-15", "Planejada");
            adicionarNave("Discovery One", "Exploração", "5");
            adicionarAstronauta("Neil Armstrong", "Comandante");
            adicionarAstronauta("Buzz Aldrin", "Piloto");

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
                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcao) {
                    case 1:
                        System.out.print("Nome da Missão: ");
                        String nomeMissao = scanner.nextLine();
                        System.out.print("Objetivo da Missão: ");
                        String objetivoMissao = scanner.nextLine();
                        System.out.print("Data de Lançamento (AAAA-MM-DD): ");
                        String dataLancamento = scanner.nextLine();
                        System.out.print("Status (Planejada, Em Andamento, Concluída, Cancelada): ");
                        String statusMissao = scanner.nextLine();
                        adicionarMissao(nomeMissao, objetivoMissao, dataLancamento, statusMissao);
                        break;
                    case 2:
                        System.out.print("Nome da Nave: ");
                        String nomeNave = scanner.nextLine();
                        System.out.print("Tipo da Nave: ");
                        String tipoNave = scanner.nextLine();
                        System.out.print("Capacidade da Nave: ");
                        String capacidadeNave = scanner.nextLine();
                        adicionarNave(nomeNave, tipoNave, capacidadeNave);
                        break;
                    case 3:
                        System.out.print("Nome do Astronauta: ");
                        String nomeAstronauta = scanner.nextLine();
                        System.out.print("Especialidade do Astronauta: ");
                        String especialidadeAstronauta = scanner.nextLine();
                        adicionarAstronauta(nomeAstronauta, especialidadeAstronauta);
                        break;
                    case 4:
                        listarMissoes();
                        break;
                    case 5:
                        listarNaves();
                        break;
                    case 6:
                        listarAstronautas();
                        break;
                    case 7:
                        System.out.print("ID da Missão para associar nave: ");
                        String idMissaoAssocNave = scanner.nextLine();
                        System.out.print("ID da Nave para associar: ");
                        String idNaveAssoc = scanner.nextLine();
                        associarNaveAMissao(idMissaoAssocNave, idNaveAssoc);
                        break;
                    case 8:
                        System.out.print("ID da Missão para associar astronauta: ");
                        String idMissaoAssocAstronauta = scanner.nextLine();
                        System.out.print("ID do Astronauta para associar: ");
                        String idAstronautaAssoc = scanner.nextLine();
                        associarAstronautaAMissao(idMissaoAssocAstronauta, idAstronautaAssoc);
                        break;
                    case 9:
                        System.out.print("ID da Missão para atualizar status: ");
                        String idMissaoAtualizar = scanner.nextLine();
                        System.out.print("Novo Status (Planejada, Em Andamento, Concluída, Cancelada): ");
                        String novoStatus = scanner.nextLine();
                        atualizarStatusMissao(idMissaoAtualizar, novoStatus);
                        break;
                    case 0:
                        System.out.println("Saindo do sistema.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);

            scanner.close();
        }

        public static void adicionarMissao(String nome, String objetivo, String dataLancamento, String status) {
            // Estrutura: [ID, Nome, Objetivo, Data, Status, Nave, Astronautas]
            missoes.add(new String[]{String.valueOf(proximoIdMissao++), nome, objetivo, dataLancamento, status, "N/A", "N/A"});
            System.out.println("Missão " + nome + " adicionada com sucesso!");
        }

        public static void adicionarNave(String nome, String tipo, String capacidade) {
            naves.add(new String[]{String.valueOf(proximoIdNave++), nome, tipo, capacidade});
            System.out.println("Nave " + nome + " adicionada com sucesso!");
        }

        public static void adicionarAstronauta(String nome, String especialidade) {
            astronautas.add(new String[]{String.valueOf(proximoIdAstronauta++), nome, especialidade});
            System.out.println("Astronauta " + nome + " adicionado com sucesso!");
        }

        public static void listarMissoes() {
            System.out.println("\n--- Lista de Missões ---");
            if (missoes.isEmpty()) {
                System.out.println("Nenhuma missão cadastrada.");
                return;
            }
            for (String[] missao : missoes) {
                System.out.println("ID: " + missao[0] + " | Nome: " + missao[1] + " | Status: " + missao[4] +
                        " | Nave: " + missao[5] + " | Astronautas: " + missao[6]);
            }
        }

        public static void listarNaves() {
            System.out.println("\n--- Lista de Naves Espaciais ---");
            if (naves.isEmpty()) {
                System.out.println("Nenhuma nave cadastrada.");
                return;
            }
            for (String[] nave : naves) {
                System.out.println("ID: " + nave[0] + " | Nome: " + nave[1] + " | Tipo: " + nave[2] + " | Cap: " + nave[3]);
            }
        }

        public static void listarAstronautas() {
            System.out.println("\n--- Lista de Astronautas ---");
            if (astronautas.isEmpty()) {
                System.out.println("Nenhum astronauta cadastrado.");
                return;
            }
            for (String[] astronauta : astronautas) {
                System.out.println("ID: " + astronauta[0] + " | Nome: " + astronauta[1] + " | Especialidade: " + astronauta[2]);
            }
        }

        public static void associarNaveAMissao(String idMissao, String idNave) {
            String nomeNave = "N/A";
            for (String[] nave : naves) {
                if (nave[0].equals(idNave)) {
                    nomeNave = nave[1];
                    break;
                }
            }

            for (String[] missao : missoes) {
                if (missao[0].equals(idMissao)) {
                    missao[5] = nomeNave;
                    System.out.println("Nave " + nomeNave + " associada à missão ID " + idMissao);
                    return;
                }
            }
            System.out.println("Missão ou Nave não encontrada.");
        }

        public static void associarAstronautaAMissao(String idMissao, String idAstronauta) {
            String nomeAstronauta = "N/A";
            for (String[] astronauta : astronautas) {
                if (astronauta[0].equals(idAstronauta)) {
                    nomeAstronauta = astronauta[1];
                    break;
                }
            }

            for (String[] missao : missoes) {
                if (missao[0].equals(idMissao)) {
                    if (missao[6].equals("N/A")) {
                        missao[6] = nomeAstronauta;
                    } else {
                        missao[6] += ", " + nomeAstronauta;
                    }
                    System.out.println("Astronauta " + nomeAstronauta + " associado à missão ID " + idMissao);
                    return;
                }
            }
            System.out.println("Missão ou Astronauta não encontrada.");
        }

        public static void atualizarStatusMissao(String idMissao, String novoStatus) {
            for (String[] missao : missoes) {
                if (missao[0].equals(idMissao)) {
                    missao[4] = novoStatus;
                    System.out.println("Status atualizado com sucesso!");
                    return;
                }
            }
            System.out.println("Missão não encontrada.");
        }
    }



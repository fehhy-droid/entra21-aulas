package TrabalhoEmSala.Gerenciadores;

import TrabalhoEmSala.Missao;
import TrabalhoEmSala.NaveEspacial;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorMissoes {
    private GerenciadorNave gerenciadorNave = new GerenciadorNave();

    private List<Missao> missoes = new ArrayList<>();

    public void adicionarMissao(String nome, String objetivo, String dataLancamento, String status) {
        Missao missao = new Missao(
                nome,
                objetivo,
                dataLancamento,
                status
        );
        missoes.add(missao);
        System.out.println("Missão adicionada!");
    }

    public void listarMissoes() {

        if (missoes.isEmpty()) {

            System.out.println("Nenhuma missão cadastrada.");

            return;

        }

        for (Missao missao : missoes) {

            System.out.println(

                    "ID: " + missao.getId() +

                            " | Nome: " + missao.getNome() +

                            " | Status: " + missao.getStatus()

            );

        }

    }
    public void associarNaveAMissao(int idMissao, int idNave) {
        Missao missaoEncontrada = null;
        for (Missao missao : missoes) {
            if (missao.getId() == idMissao) {
                missaoEncontrada = missao;
                break;
            }
        }
        NaveEspacial naveEncontrada = gerenciadorNave.buscarPorId(idNave);
        if (missaoEncontrada != null && naveEncontrada != null) {
            missaoEncontrada.setNave(naveEncontrada);
            System.out.println("Nave associada!");
            return;
        }
        System.out.println("Missão ou nave não encontrada.");
    }
}

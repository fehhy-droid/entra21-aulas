package TrabalhoEmSala.Gerenciadores;

import TrabalhoEmSala.Astronauta;
import TrabalhoEmSala.Missao;
import TrabalhoEmSala.NaveEspacial;
import TrabalhoEmSala.StatusMissao;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorMissoes {
    private GerenciadorNave gerenciadorNave ;
    private GerenciadorAstronauta gerenciadorAstronauta;
    private List<Missao> missoes = new ArrayList<>();

    public GerenciadorMissoes(GerenciadorNave gerenciadorNave, GerenciadorAstronauta gerenciadorAstronauta) {
        this.gerenciadorNave = gerenciadorNave;
        this.gerenciadorAstronauta = gerenciadorAstronauta;
    }


    public void adicionarMissao(String nome, String objetivo, String dataLancamento, StatusMissao status) {
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
                System.out.println("Missão encontrada");
                break;
            }
        }
        NaveEspacial naveEncontrada = gerenciadorNave.buscarPorId(idNave);

        System.out.println("ID da nave" + idNave);
        System.out.println("ID da missão" + idMissao);

        if (missaoEncontrada != null && naveEncontrada != null) {
            missaoEncontrada.setNave(naveEncontrada);
            System.out.println("Nave associada!");

        } else {

            System.out.println("Missão ou nave não encontrada.");
        }
    }
    public void associarAstronautaAMissao(int idMissao, int idAstronauta) {
        Missao missaoEncontrada = null;
        for (Missao missao : missoes) {
            if (missao.getId() == idMissao) {
                missaoEncontrada = missao;
                System.out.println("Missão encontrada");
                break;
            }
        }
        Astronauta astronautaEncontrado = gerenciadorAstronauta.buscarPorId(idAstronauta);


        if (missaoEncontrada != null && astronautaEncontrado != null) {
            missaoEncontrada.setAstronauta(astronautaEncontrado);
            System.out.println("Astronauta associado!");

        } else {

            System.out.println("Missão ou nave não encontrada.");
        }
    }
    public void atualizarStatusMissao(int idMissao, String novoStatus) {

        for (Missao missao : missoes) {

            if (missao.getId() == idMissao) {



                System.out.println("Status atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Missão não encontrada.");
    }

}
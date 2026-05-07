package TrabalhoEmSala.Gerenciadores;

import TrabalhoEmSala.Missao;
import TrabalhoEmSala.NaveEspacial;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNave {

    private List<NaveEspacial> naves = new ArrayList<>();

    public void adicionarNave(String nome, String tipo, String capacidade) {
        NaveEspacial nave = new NaveEspacial(nome, tipo, capacidade);
        naves.add(nave);
        System.out.println("Nave adicionada!");
    }

    public void listarNaves(){

        if (naves.isEmpty()) {

            System.out.println("Nenhuma nave cadastrada.");

            return;

        }

        for (NaveEspacial naveEspacial : naves) {

            System.out.println(

                    "ID: " + naveEspacial.getId() +

                            " | Nome: " + naveEspacial.getNome() +
                            " | Tipo: " + naveEspacial.getTipo() +
                            " | Capacidade: " + naveEspacial.getCapacidade()



            );
        }
    }
    public NaveEspacial buscarPorId(int id) {
        for (NaveEspacial nave : naves) {
            System.out.println("ID da nave" + nave.getId());
            if (nave.getId() == id) {
                return nave;
            }
        }
        return null;
    }

}

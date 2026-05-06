package TrabalhoEmSala.Gerenciadores;

import TrabalhoEmSala.Astronauta;
import TrabalhoEmSala.NaveEspacial;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAstronauta {
        private List<Astronauta> astronautas = new ArrayList<>();

        public void adicionarAstronauta(String nome, String especialidade) {
            Astronauta astronauta = new Astronauta(nome, especialidade);
            astronautas.add(astronauta);
            System.out.println("Astronauta adicionada!");
        }
    public void listarAstronauta() {

        if (astronautas.isEmpty()) {

            System.out.println("Nenhuma missão cadastrada.");

            return;

        }

        for (Astronauta astronauta : astronautas) {

            System.out.println(

                    "ID: " + astronauta.getId() +

                            " | Nome: " + astronauta.getNome() +
                            " | Especialidade: " + astronauta.getEspecialidadeAstronauta()



            );
        }
    }
}

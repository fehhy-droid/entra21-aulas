package TrabalhoEmSala;

public class Astronauta extends Identidade {
    private String nome;
    private String especialidadeAstronauta;

    public Astronauta(String nomeAstronauta, String especialidadeAstronauta) {
        super.setId(gerarId());
        super.setNome(nomeAstronauta);
        this.especialidadeAstronauta = especialidadeAstronauta;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidadeAstronauta() {
        return especialidadeAstronauta;
    }

}

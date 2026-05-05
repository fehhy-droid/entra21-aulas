package TrabalhoEmSala;

public class Astronauta {
    private String nomeAstronauta;
    private String especialidadeAstronauta;

    public Astronauta(String nomeAstronauta, String especialidadeAstronauta) {
        this.nomeAstronauta = nomeAstronauta;
        this.especialidadeAstronauta = especialidadeAstronauta;
    }

    public String getNomeAstronauta() {
        return nomeAstronauta;
    }

    public String getEspecialidadeAstronauta() {
        return especialidadeAstronauta;
    }

}

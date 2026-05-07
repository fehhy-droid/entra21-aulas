package TrabalhoEmSala;

public class Astronauta extends Identidade {
    private String nome;
    private String especialidadeAstronauta;

    private static int proximoId = 1;

    public Astronauta(String nomeAstronauta, String especialidadeAstronauta) {
        super.setId(gerarId());
        super.setNome(nomeAstronauta);
        this.especialidadeAstronauta = especialidadeAstronauta;
    }
    protected static int gerarId() {
        return proximoId++;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidadeAstronauta() {
        return especialidadeAstronauta;
    }

}

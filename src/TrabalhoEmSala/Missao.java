package TrabalhoEmSala;

public class Missao extends Identidade {

    private String objetivo;
    private String dataLancamento;
    private String status;
    private NaveEspacial nave;
    private Astronauta astronauta;


    public Missao(String nome, String objetivo, String dataLancamento, String status) {
        super.setId(gerarId());
        super.setNome(nome);
        this.objetivo = objetivo;
        this.dataLancamento = dataLancamento;
        this.status = status;
    }

    public NaveEspacial getNave() {
        return nave;
    }

    public void setNave(NaveEspacial nave) {
        this.nave = nave;
    }

    public Astronauta getAstronauta() {
        return astronauta;
    }

    public void setAstronauta(Astronauta astronauta) {
        this.astronauta = astronauta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    }




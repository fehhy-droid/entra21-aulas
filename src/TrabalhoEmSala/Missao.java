package TrabalhoEmSala;

public class Missao extends Identidade {

    private String objetivo;
    private String dataLancamento;
    private StatusMissao status;
    private NaveEspacial nave;
    private Astronauta astronauta;
    private static int proximoId = 1;


    public Missao(String nome, String objetivo, String dataLancamento, StatusMissao status) {
        super.setId(gerarId());
        super.setNome(nome);
        this.objetivo = objetivo;
        this.dataLancamento = dataLancamento;
        this.status = status;
    }
    protected static int gerarId() {
        return proximoId++;
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

    public StatusMissao getStatus() {
        return status;
    }

    public void setStatus(StatusMissao status) {
        this.status = status;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Missao.proximoId = proximoId;
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




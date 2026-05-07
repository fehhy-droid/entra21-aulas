package TrabalhoEmSala;

import java.util.List;

public class NaveEspacial extends Identidade {
    private String tipo;
    private String capacidade;
    private List<Astronauta> astronautas;
    private static int proximoId = 1;


    public NaveEspacial(String nome, String tipo, String capacidade) {
        super.setId(gerarId());
        super.setNome(nome);
        this.tipo = tipo;
        this.capacidade = capacidade;

    }
    protected static int gerarId() {
        return proximoId++;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

}

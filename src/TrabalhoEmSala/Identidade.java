package TrabalhoEmSala;

public class Identidade {
    private static int proximoId = 0;

    private int id;
    private String nome;

    protected static int gerarId() {
        return proximoId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

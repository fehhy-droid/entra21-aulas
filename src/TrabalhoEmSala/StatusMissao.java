package TrabalhoEmSala;

public enum StatusMissao {
    PLANEJADA,
    EM_ANDAMENTO,
    CONCLUIDA,
    CANCELADA;

    public static StatusMissao converter(String texto) {
        return switch (texto.toLowerCase()) {
            case "planejada" -> PLANEJADA;
            case "em andamento" -> EM_ANDAMENTO;
            case "concluida" -> CONCLUIDA;
            case "cancelada" -> CANCELADA;
            default -> null;
        };
    }
}

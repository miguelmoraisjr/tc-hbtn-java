public class Tarefa {

    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public void modificarDescricao(String texto) {
        if (texto.equalsIgnoreCase("") || texto == null) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        } else {
            this.descricao = texto;
        }
    }
}

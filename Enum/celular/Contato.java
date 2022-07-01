import java.util.Objects;

public class Contato {

    private String nome;
    private String numeroTefelone;
    private TipoNumero tipoNumero;

    public Contato(String nome, String numeroTefelone, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numeroTefelone = numeroTefelone;
        this.tipoNumero = tipoNumero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTefelone() {
        return numeroTefelone;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

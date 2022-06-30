import java.util.Objects;

public class Telefone {

    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.numero = numero;
        this.codigoArea = codigoArea;
    }

    @Override
    public String toString() {
        return "(" + codigoArea + ") " + numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telefone telefone = (Telefone) o;

        if (!Objects.equals(codigoArea, telefone.codigoArea)) return false;
        return Objects.equals(numero, telefone.numero);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigoArea);
        hash = 31 * hash + Objects.hashCode(this.numero);
        return hash;
    }


}
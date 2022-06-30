public class Telefone {

    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", codigoArea, numero);
    }
}

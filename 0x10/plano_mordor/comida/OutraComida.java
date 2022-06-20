package comida;

public class OutraComida extends Comida{

    public OutraComida(int pontosDeFelicidade) {
        super(pontosDeFelicidade);
        this.pontosDeFelicidade = -1;
    }
    public OutraComida() {
        this.pontosDeFelicidade = -1;
    }
}

package comida;

public class Cogumelo extends Comida{

    public Cogumelo(int pontosDeFelicidade) {
        super(pontosDeFelicidade);
        this.pontosDeFelicidade = -10;
    }

    public Cogumelo() {
        this.pontosDeFelicidade = -10;
    }
}

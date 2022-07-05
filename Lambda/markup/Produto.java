import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkup;

    Supplier<Double> precoComMarkup = () ->  preco + (preco * percentualMarkup);

    Consumer<Double> atualizarMarkup = (x) -> setPercentualMarkup(x /100);

    public Produto( double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkup = 0.1;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }
}
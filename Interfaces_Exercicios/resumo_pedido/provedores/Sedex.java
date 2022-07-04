package provedores;

public class Sedex implements ProvedorFrete{

    public Sedex() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso > 1000.00) {
            double novoValor = valor * 0.1;
            return new Frete(novoValor,TipoProvedorFrete.SEDEX);
        } else {
            double novoValor = valor * 0.05;
            return new Frete(novoValor,TipoProvedorFrete.SEDEX);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }

}

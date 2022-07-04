package provedores;

public class Loggi implements ProvedorFrete{

    public Loggi() {
    }


    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso > 5000.00) {
            double novoValor = valor * 0.12;
            return new Frete(novoValor,TipoProvedorFrete.LOGGI);
        } else {
            double novoValor = valor * 0.04;
            return new Frete(novoValor,TipoProvedorFrete.LOGGI);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}

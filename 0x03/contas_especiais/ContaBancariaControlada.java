public class ContaBancariaControlada extends ContaBancariaBasica{

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        if (saldo <= saldoMinimo){
            saldo = saldo + calcularJurosMensal() - calcularTarifaMensal() - valorPenalidade;
        } else {
            saldo = saldo + calcularJurosMensal() - calcularTarifaMensal();
        }
    }

}

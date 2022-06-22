import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;


    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }


    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0 ) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        } else {
            saldo = saldo + valor - 0.10;
            quantidadeTransacoes++;
        }
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0 ) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else  if (saldo < valor){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        } else {
            saldo = saldo - valor - 0.1;
            quantidadeTransacoes++;
        }
    }
}

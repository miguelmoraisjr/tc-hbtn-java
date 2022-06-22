import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0.0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0 ) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0 ) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else  if (saldo < valor){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        } else {
            this.saldo -= valor;
        }
    }

    public double calcularTarifaMensal() {
        if ((saldo * 10 / 100) > 10.00) {
            return 10.00;
        } else {
            return (saldo * 10 / 100);
        }
    }

    public double calcularJurosMensal() {
        if (saldo < 0 ) {
          return 0.0;
        } else {
           return saldo * (taxaJurosAnual / 12 / 100);
        }
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = saldo + calcularJurosMensal() - calcularTarifaMensal();
    }
}

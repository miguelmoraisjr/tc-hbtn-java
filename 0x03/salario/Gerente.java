public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double bonus;
        if (departamento.alcancouMeta() == true) {
            return bonus = (getSalarioFixo() * 0.2) + ((departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01);
        } else {
            return bonus = 0.0;
        }
    }
}

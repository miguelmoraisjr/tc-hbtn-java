public class Quadrado extends Retangulo{

    private double lado;

    public Quadrado(double largura, double altura, double lado) {
        super(largura, altura);
        this.lado = lado;
    }
    public Quadrado(){

    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        } else {
            this.lado = lado;
            this.altura = lado;
            this.largura = lado;
        }
    }

    @Override
    public String toString() {
        return String.format("[Quadrado] %.2f", lado );
    }
}

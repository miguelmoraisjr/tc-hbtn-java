public class Retangulo extends FormaGeometrica {

    protected double largura;
    protected double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public Retangulo(){

    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        } else {
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0 ){
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        } else {
            this.altura = altura;
        }
    }

    @Override
    public double area() {
        double resultado = largura * altura;
        return resultado;
    }

    @Override
    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f",largura, altura );
    }
}

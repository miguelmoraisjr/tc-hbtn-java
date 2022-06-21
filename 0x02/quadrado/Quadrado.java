public class Quadrado {

    public static double area(double lado) {
        if (lado > 0 ){
            double areaQuadrado = lado * lado;
            return areaQuadrado;
        } else {
            throw new IllegalArgumentException("Lado deve possuir valor positivo.");
        }
    }
}

import java.text.Format;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        final var localeBrasil = new Locale("pt", "BR");
        Locale.setDefault(localeBrasil);
        System.out.printf("Valor: R$ %,.2f\n", valor);
        System.out.printf("Taxa: %.2f%%\n", taxa);
    }
}
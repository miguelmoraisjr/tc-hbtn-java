import java.util.List;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
       TreeMap<String, Integer> contagemFrase1 = AnalisadorFrase.contagemPalavras("Tres pratos de trigo para tres tigres tristes");
       // List<String> palavras = AnalisadorFrase.contagemPalavras("O que eh que Caca quer? Caca quer caqui. Qual caqui que Caca quer? Caca quer qualquer caqui.");
         System.out.println(contagemFrase1);
     //  String palavra = "Quer?";
     //  System.out.println(AnalisadorFrase.menusculo(palavra));

    }
}
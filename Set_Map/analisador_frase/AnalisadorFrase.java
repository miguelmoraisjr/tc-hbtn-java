import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap contagemPalavras(String texto){
        TreeMap<String, Integer> listMap = new TreeMap<>();
        List<String> list = contar(texto);
        int contagem = 1;
        for (String palavra : list) {
            String nova = menusculo(palavra);
            listMap.put(nova, contagem);

       /*     if (listMap.containsKey(nova)) {
                listMap.replace(nova, contagem, contagem++);

            } else {
                listMap.
            } */
        }
        return listMap;
    }

    public static List contar(String texto){
        List<String> palavras = new ArrayList<>();
        List<String> alteradas = new ArrayList<>();
        String[] fields = texto.split(" ");
        for (int i=0; i < fields.length; i++){
            palavras.add(fields[i]);
        }
        for (String palavra : palavras) {
            alteradas.add(trocarPalavras(palavra));
        }
        return alteradas;
    }

    public static String trocarPalavras(String texto) {
        String novoTexto = texto;
        if (texto.contains("?")) {
            novoTexto = texto.replace("?", "");
        } else if (texto.contains("!")) {
            novoTexto = texto.replace("!", "");
        } else if (texto.contains(".")) {
            novoTexto = texto.replace(".", "");
        }
        return novoTexto;
    }

    public static String menusculo(String texto){
        return texto.toLowerCase();
    }
}



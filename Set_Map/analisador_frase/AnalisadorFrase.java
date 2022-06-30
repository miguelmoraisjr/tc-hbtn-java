import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap contagePalavras(String texto){
        TreeMap<String, Integer> listMap = new TreeMap<>();
        List<String> list = contar(texto);
        int contagem = 1;
        for (String palavra : list) {
            String nova = menusculo(palavra);
            listMap.put(nova, contagem);

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


    public static TreeMap<String, Integer> contagemPalavras( String texto){
        String[] palavras = texto.toLowerCase(Locale.ROOT).split("[?.! ]+");
        TreeMap<String, Integer> lista = new TreeMap<String, Integer>();
        for(int i= 0; i < palavras.length; i ++){
            if(lista.isEmpty()){
                lista.put(palavras[0],1);
            }else{
                if(lista.containsKey(palavras[i])){
                    Integer aux = lista.get(palavras[i]);
                    lista.replace(palavras[i],aux + 1);
                }else{
                    lista.put(palavras[i], 1);
                }
            }
        }
        return lista;
    }
}



import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

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



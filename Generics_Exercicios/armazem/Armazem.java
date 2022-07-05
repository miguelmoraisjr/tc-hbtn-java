import java.util.HashMap;
import java.util.Map;

public class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> itens;

    public Armazem() {
        this.itens = new HashMap<String, T>();
    }

    public Map<String, T> getItens() {
        return itens;
    }


    @Override
    public void adicionarAoInventario(String nome, T valor) {
        itens.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        T item = null;
        if (itens.containsKey(nome)) {
            item = itens.get(nome);
        }
        return item;
    }


}

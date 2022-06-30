import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> list;

    public ListaTelefonica() {
        list = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> lista = buscar(nome);
        if (lista == null) {
            ArrayList<Telefone> newList = new ArrayList<Telefone>();
            newList.add(telefone);
            list.put(nome, newList);
        } else {
            lista.add(telefone);
            list.put(nome, lista);
        }
    }

    public ArrayList<Telefone> buscar(String nome){
        return list.get(nome);
    }


}

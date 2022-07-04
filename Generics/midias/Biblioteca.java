import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia>{

    private List<T> list;

    public Biblioteca() {
        this.list = new ArrayList<T>();
    }

    public List<T> getList() {
        return list;
    }

    public void adicionarMidia(T midia) {
        list.add(midia);
    }

    public List<T> obterListaMidias(){
        return list;
    }
}

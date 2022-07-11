import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> list, CriterioFiltro criterioFiltro) {
        List<Produto> newList = new ArrayList<>();
        for (Produto produto: list) {
            if (criterioFiltro.testar(produto) == true) {
                newList.add(produto);
            }
        }
        return newList;
    }
}

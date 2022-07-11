import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> list, Predicate<Produto> predicate) {
        List<Produto> newList = new ArrayList<>();
        for (Produto produto: list) {
            if (predicate.test(produto) == true) {
                newList.add(produto);
            }
        }
        return newList;
    }
}

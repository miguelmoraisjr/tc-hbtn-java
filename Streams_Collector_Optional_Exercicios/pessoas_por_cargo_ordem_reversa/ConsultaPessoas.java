import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        TreeMap<String, TreeSet<Pessoa>> collect = pessoas.stream().collect(Collectors.groupingBy(p -> new TreeMap<>(p.getCargo(), new TreeSet<>((p)).comparator().reversed()) );
    }
}

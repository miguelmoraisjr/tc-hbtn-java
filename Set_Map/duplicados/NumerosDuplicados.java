import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] inteiros) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashSet<Integer> duplicados = new HashSet<Integer>();
        for (int i=0; i < inteiros.length; i++) {
            if (!hashSet.contains(inteiros[i])){
                hashSet.add(inteiros[i]);
            } else {
                duplicados.add(inteiros[i]);
            }
        }
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.addAll(duplicados);
        
        return treeSet;
    }
}

import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> list, int numero) {
        return list.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> list, int numero) {
        int result = buscarPosicaoNumero(list, numero);
        if (result != -1) {
            throw new RuntimeException("Numero jah contido na lista");
        } else {
            list.add(numero);
        }
    }

    public static void removerNumero(List<Integer> list, int numero){
        int result = buscarPosicaoNumero(list, numero);
        if (result == -1) {
            throw new RuntimeException("Numero nao encontrado na lista");
        } else {
            list.remove(numero);
        }
    }

    public static void substituirNumero(List<Integer> list, int numeroSubstituir, int numeroSubstituto) {
        int result = buscarPosicaoNumero(list, numeroSubstituir);
        if (result == -1) {
            list.add(numeroSubstituto);
        } else {
            list.set(result,numeroSubstituto);
        }
    }
}

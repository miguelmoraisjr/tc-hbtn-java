import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> list, int numero) {
        return list.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> list, int numero) throws IllegalArgumentException {
        int result = buscarPosicaoNumero(list, numero);
        if (result == -1) {
            list.add(numero);
        } else {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> list, int numero) throws IllegalArgumentException {
        int result = buscarPosicaoNumero(list, numero);
        if (result != -1) {
            list.remove(Integer.valueOf(numero));
        } else {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
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

import java.util.*;
public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> lista;
    public ListaTelefonica() {
        this.lista = new HashMap<>();
    }
    public HashSet<Telefone> buscar(String nome){

        for (String listaTel : lista.keySet() ) {
            if(listaTel.equals(nome)){
                return lista.get(listaTel);
            }
        }
        return null;
    }
    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){

        HashSet<Telefone> numero;
        numero = lista.get(nome);
        if(numero==null){
            numero = new HashSet<Telefone>();
        }
        if(numero.contains(telefone)){
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }
        Iterator<HashSet<Telefone>> telefones = lista.values().iterator();
        while (telefones.hasNext()){
            for(Telefone tel : telefones.next()){
                if(tel.equals(telefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        }

        numero.add(telefone);
        lista.put(nome,numero);
        return numero;
    }

}
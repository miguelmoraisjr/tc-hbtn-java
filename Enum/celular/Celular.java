import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<Contato>();
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public int obterPosicaoContato(String nomeContato) {
        int chave = -1;
        for (Contato contato: contatos) {
            if (contato.getNome().equals(nomeContato)) {
                chave = contatos.indexOf(contato);
            }
        }
        return chave;
    }

    public void adicionarContato(Contato contato) {
        if (contatos.isEmpty()) {
            contatos.add(contato);
        } else {
            if (obterPosicaoContato(contato.getNome()) == -1) {
                contatos.add(contato);
            } else {
                throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
            }
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        if (obterPosicaoContato(contatoAntigo.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        } else if (obterPosicaoContato(novoContato.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        } else {
            contatos.set(contatos.indexOf(contatoAntigo), novoContato);
        }
    }

    public void removerContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        } else {
            contatos.remove(contato);
        }
    }

    public void listarContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato.getNome() + " -> " + contato.getNumeroTefelone() + " (" + contato.getTipoNumero() + ")");
        }
    }
}

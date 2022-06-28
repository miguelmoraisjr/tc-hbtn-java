import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        for (Tarefa x : tarefas) {
            if (tarefa.getIdentificador() == x.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa x : tarefas) {
            if (x.getIdentificador() == identificador) {
                x.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (Tarefa x : tarefas) {
            if (x.getIdentificador() == identificador) {
                x.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa x : tarefas) {
            x.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa x : tarefas) {
            x.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for (Tarefa x : tarefas) {
            if (x.isEstahFeita() == true) {
                System.out.println("[X] " + " Id: " + x.getIdentificador() + " - Descricao: " + x.getDescricao());
            } else {
                System.out.println("[ ] " + " Id: " + x.getIdentificador() + " - Descricao: " + x.getDescricao());
            }
        }
    }
}

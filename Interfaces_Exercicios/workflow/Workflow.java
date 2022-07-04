import atividades.Atividade;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Workflow {

    private ArrayList<Atividade> atividades;

    public Workflow() {
        this.atividades = new ArrayList<Atividade>();
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void registrarAtividade(Atividade atividade){
        atividades.add(atividade);
    }
}

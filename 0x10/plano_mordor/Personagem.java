import comida.Comida;
import humor.*;

public class Personagem {

    private int pontosDeFelicidade;

    public Personagem() {
    }

    public Humor obterHumorAtual(){
        if (pontosDeFelicidade < -5){
            return new Irritado();
        } else if (pontosDeFelicidade >= -5 && pontosDeFelicidade <= 0){
            return new Triste();
        } else if (pontosDeFelicidade >= 1 && pontosDeFelicidade <= 15){
            return new Feliz();
        } else {
            return new MuitoFeliz();
        }
    }

    public void comer(Comida[] vetor){
        for (int i=0; i <= vetor.length -1; i++){
            pontosDeFelicidade += vetor[i].getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual();
    }
}

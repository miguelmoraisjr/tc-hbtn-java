import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<CanalNotificacao>();
    }

    public void registrarCanal(CanalNotificacao canal) {
        this.canais.add(canal);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal: canais) {
            System.out.println(canal.toString() + " {LOG} - " + video.getArquivo() + " - " + video.getFormato());
        }
    }
}

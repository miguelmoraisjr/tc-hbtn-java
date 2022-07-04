public class Slack implements CanalNotificacao{

    public Slack() {
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[SLACK] " + mensagem.getTipoMensagem() + " - " + mensagem.getTexto());
    }

    @Override
    public String toString() {
        return "[SLACK]";
    }
}

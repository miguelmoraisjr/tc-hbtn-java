public class Teams implements CanalNotificacao{

    public Teams(){
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[TEAMS] " + mensagem.getTipoMensagem() + " - " + mensagem.getTexto());
    }

    @Override
    public String toString() {
        return "[TEAMS]";
    }
}

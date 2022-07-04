public class Email implements CanalNotificacao{

    public Email(){
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[EMAIL] " + mensagem.getTipoMensagem() + " - " + mensagem.getTexto());
    }

    @Override
    public String toString() {
        return "[EMAIL]";
    }
}

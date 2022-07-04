public class Sms implements CanalNotificacao{

    public Sms(){
    }


    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[SMS] " + mensagem.getTipoMensagem() + " - " + mensagem.getTexto());
    }

    @Override
    public String toString() {
        return "[SMS]";
    }
}

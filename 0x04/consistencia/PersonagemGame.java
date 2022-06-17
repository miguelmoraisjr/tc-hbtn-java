public class PersonagemGame {

    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        setNome(nome);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }

    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano) {
        this.saudeAtual -= quantidadeDeDano;
        setSaudeAtual(saudeAtual);
        if (saudeAtual <= 0){
            setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        this.saudeAtual += quantidadeDeCura;
        setSaudeAtual(saudeAtual);
        if (saudeAtual >= 100) {
            setSaudeAtual(100);
        }
    }
}

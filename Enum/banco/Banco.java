import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nomeDaAgencia) {
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(nomeDaAgencia)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeDaAgencia) {
        Agencia agencia = buscarAgencia(nomeDaAgencia);
        if (agencia == null) {
            agencias.add(new Agencia(nomeDaAgencia));
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionarCliente(String nomeDaAgencia, String nomeDoCliente, double transacaoInicial) {
        Agencia agencia = buscarAgencia(nomeDaAgencia);
        Cliente cliente = agencia.buscarCliente(nomeDoCliente);
        if (cliente == null) {
            agencia.novoCliente(nomeDoCliente, transacaoInicial);
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionarTransacaoCliente(String nomeDaAgencia, String nomeDoCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeDaAgencia);
        if (agencia == null) {
            return false;
        } else {
            Cliente cliente = agencia.buscarCliente(nomeDoCliente);
            if (cliente == null) {
                return false;
            } else {
                cliente.adicionarTransacao(valorTransacao);
                return true;
            }
        }
    }

    public boolean listarClientes(String nomeDaAgencia, boolean imprimiTransacoes) {
        Agencia agencia = buscarAgencia(nomeDaAgencia);
        if (imprimiTransacoes == false) {
            for (int i=1; i <= agencia.getClientes().size(); i++) {
                System.out.println("Cliente: " + agencia.getClientes().get(i).getNome() + " [" + i + "]");
            }
            return false;
        } else {
            for (int i=0; i <= agencia.getClientes().size() -1; i++) {
                System.out.println("Cliente: " + agencia.getClientes().get(i).getNome() + " [" + (i+1) + "]");
                int cont = 1;
                for (Double transacao : agencia.getClientes().get(i).getTransacoes()) {
                    System.out.printf("[%d] valor %.2f\n", cont++, transacao);
                }
            }
            return true;
        }
    }
}

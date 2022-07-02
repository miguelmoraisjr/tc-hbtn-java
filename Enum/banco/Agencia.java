import java.util.ArrayList;
import java.util.Optional;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeDoCliente, double transacaoInicial) {
        //Optional<Cliente> cliente = Optional.ofNullable(buscarCliente(nomeDoCliente));
        Cliente cliente = buscarCliente(nomeDoCliente);
        if (cliente == null) {
            Cliente addCliente = new Cliente(nomeDoCliente, transacaoInicial);
            addCliente.adicionarTransacao(transacaoInicial);
            clientes.add(addCliente);
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionarTransacaoCliente(String nomeDoCliente, double valorTransacao) {
        Cliente cliente = buscarCliente(nomeDoCliente);
        if (cliente != null) {
            cliente.adicionarTransacao(valorTransacao);
            return true;
        } else {
            return false;
        }
    }

    public Cliente buscarCliente(String nomeDoCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nomeDoCliente)) {
                return cliente;
            }
        }
        return null;
    }
}

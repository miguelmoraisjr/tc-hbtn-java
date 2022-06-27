public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public Pedido(){
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public double calcularTotal(){
        double soma = 0;
        double total;
        for (int i=0; i < itens.length; i++) {
           soma = soma + itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
        }
        return total = soma - (soma * percentualDesconto/100);
    }
}

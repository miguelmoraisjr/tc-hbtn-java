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

    public double totalProdutos(){
        double soma = 0;
        for (int i=0; i < itens.length; i++) {
            soma = soma + itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
        }
        return soma;
    }

    public void apresentarResumoPedido(){
        System.out.println("------- RESUMO PEDIDO -------");
        for (int i=0; i < itens.length; i++) {
            System.out.printf("Tipo %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    itens[i].getProduto().getClass().getSimpleName(), itens[i].getProduto().getTitulo(),
                    itens[i].getProduto().obterPrecoLiquido(), itens[i].getQuantidade(), (itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade()));
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", percentualDesconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalProdutos());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
    }
}

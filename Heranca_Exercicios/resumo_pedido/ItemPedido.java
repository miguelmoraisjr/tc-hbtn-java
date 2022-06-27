import produtos.Produto;

public class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public ItemPedido(){
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return String.format("Tipo %.s  Titulo: %.s Preco: %.2f Quant: %d Total: %.2f",
                produto.getClass().getSimpleName(), produto.getTitulo(), produto.obterPrecoLiquido(),
                quantidade, (produto.obterPrecoLiquido() * quantidade));
    }
}

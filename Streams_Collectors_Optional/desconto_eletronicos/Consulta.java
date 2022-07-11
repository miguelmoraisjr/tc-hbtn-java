import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> listLivro = pedido.getProdutos().stream()
                .filter(x -> x.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());
        return listLivro;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> lista) {
        Optional<Produto> produto = lista.stream().min(Comparator.comparing(Produto::getPreco).reversed());
        Produto novoProduto = produto.get();
        return novoProduto;
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> lista, double precoMinimo) {
        List<Produto> listMinimo = lista.stream().filter(p -> p.getPreco() >= precoMinimo).collect(Collectors.toList());
        return  listMinimo;
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        List<Pedido> pedidoEletronicos = new ArrayList<>();
        for (Pedido pedido: pedidos) {
           if (pedido.getProdutos().stream().anyMatch(p -> p.getCategoria().equals(CategoriaProduto.ELETRONICO)) == true) {
               pedidoEletronicos.add(pedido);
           }
        }
        return pedidoEletronicos;
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> lista) {
        List<Produto> produtosDesconto = new ArrayList<>();
        produtosDesconto = lista.stream()
                .map(p -> {
                    if (p.getCategoria().equals(CategoriaProduto.ELETRONICO)) {
                        p.setPreco(p.getPreco() * 0.85);
                    }
                    return p;
                }).collect(Collectors.toList());
        return produtosDesconto;
    }
}
